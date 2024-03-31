package model;

import controller.NumberGenerator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {
    private static final int DEFAULT_POSITION = 0;

    private final List<RacingCar> cars;

    public RacingCars(final List<RacingCar> cars) {
        this.cars = Collections.unmodifiableList(cars);
    }

    public static RacingCars from(final List<String> carNames) {
        List<RacingCar> cars = carNames.stream()
                .map(RacingCar::from)
                .collect(Collectors.toList());
        return new RacingCars(cars);
    }

    public void moveAll(final NumberGenerator numberGenerator) {
        for (RacingCar car : cars) {
            int number = numberGenerator.generate();
            car.move(number);
        }
    }

    public RacingCars findWinners() {
        int maxPosition = getMaxPosition();
        List<RacingCar> winningCars = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
        return new RacingCars(winningCars);
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(RacingCar::getPosition)
                .max()
                .orElse(DEFAULT_POSITION);
    }

    public List<RacingCar> getCars() {
        return cars;
    }
}

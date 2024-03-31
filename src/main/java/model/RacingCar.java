package model;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    private static final int MOVED_LOWER_BOUND = 4;

    private static String carName;
    private int position;
    private int cnt;

    private RacingCar(final String name, final int position) {
        this.carName = name;
        this.position = position;
    }

    public static RacingCar getInstance(final RacingCar car) {
        return new RacingCar(car.getName(), car.getPosition());
    }

    public static List<RacingCar> getInstances(final RacingCars cars) {
        return cars.getCars().stream()
                .map(RacingCar::getInstance)
                .collect(Collectors.toList());
    }

    public String getName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public static RacingCar from(String s) {
        return new RacingCar(s, 0);
    }

    public void move(final int number) {
        if (number >= MOVED_LOWER_BOUND) {
            this.position += 1;
        }
    }
}

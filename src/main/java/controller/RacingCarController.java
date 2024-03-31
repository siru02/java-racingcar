package controller;

import model.AttemptNumber;
import model.RacingCar;
import model.RacingCars;

import java.io.IOException;
import java.util.List;
import view.*;

public class RacingCarController {
    private final NumberGenerator numberGenerator;

    public RacingCarController() {
        this.numberGenerator = new RandomNumberGenerator();
    }

    public void run() throws IOException {
        RacingCars cars = getCars();
        AttemptNumber attemptNumber = getAttemptNumber();
        race(cars, attemptNumber);
        printWinners(cars);
    }

    private RacingCars getCars() throws IOException {
        List<String> carNames = Input.carNameInput();
        try {
            return RacingCars.from(carNames);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCars();
        }
    }

    private AttemptNumber getAttemptNumber() throws IOException {
        try {
            int number = Input.playTimeInput();
            return new AttemptNumber(number);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getAttemptNumber();
        }
    }

    private void race(RacingCars cars, final AttemptNumber attemptNumber) throws IOException {
        Output.printResult();
        while (attemptNumber.isRemain()) {
            attemptNumber.decrease();
            cars.moveAll(numberGenerator);
            printStatus(cars);
        }
    }

    private void printStatus(final RacingCars cars) {
        List<RacingCar> carDtos = RacingCar.getInstances(cars);
        Output.printStatus(carDtos);
    }

    private void printWinners(final RacingCars cars) {
        RacingCars winnerCars = cars.findWinners();
        List<RacingCar> winnerCarDtos = RacingCar.getInstances(winnerCars);
        Output.printWinners(winnerCarDtos);
    }
}

package view;

import model.RacingCar;

import java.util.List;
import java.util.stream.Collectors;

public class Output {
    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String STATUS_PRINT_FORMAT = "%s : %s" + LINE_SEPARATOR;
    private static final String WINNER_PRINT_FORMAT = "%s가 최종 우승했습니다." + LINE_SEPARATOR;
    private static final String WORD_DELIMITER = ", ";
    private static final String POSITION_SYMBOL = "-";

    public static void printResult() {
        System.out.println(RESULT_MESSAGE);
    }

    public static void printStatus(final List<RacingCar> racingCars) {
        for (RacingCar car : racingCars) {
            String currentPosition = getCurrentPosition(car.getPosition());
            System.out.printf(STATUS_PRINT_FORMAT, car.getName(), currentPosition);
        }
        System.out.println();
    }

    private static String getCurrentPosition(final int position) {
        return POSITION_SYMBOL.repeat(Math.max(0, position));
    }

    public static void printWinners(final List<RacingCar> racingCars) {
        List<String> carNames = racingCars.stream() //리스트를 스트림하는 부분
                .map(RacingCar::getName)
                .collect(Collectors.toList());
        String winners = String.join(WORD_DELIMITER, carNames);
        System.out.printf(WINNER_PRINT_FORMAT, winners);
    }
}

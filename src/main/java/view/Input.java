package view;

import controller.IntegerParser;
import controller.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static final String CAR_INPUT =  "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRY_CNT = "시도할 회수는 몇회인가요?";
    private static Scanner scanner = new Scanner(System.in);
    static String  inputString;
    String  inputStringSplit[];
    public static List <String> carNameInput(){
        System.out.println(CAR_INPUT);
        inputString = scanner.nextLine();
        return (util.splitByDelemeter(inputString, ","));
    }
    public static int playTimeInput() {
        try {
            System.out.println(TRY_CNT);
            String input = scanner.nextLine();
            return IntegerParser.parse(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return playTimeInput(); //while문 없이 재귀형식으로 반복입력도 가능하다
        }
    }
}

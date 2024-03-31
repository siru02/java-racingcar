package view;

import controller.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static final String CAR_INPUT =  "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String CNT = "시도할 회수는 몇회인가요?";
    private static Scanner scanner = new Scanner(System.in);
    String  inputString;
    String  inputStringSplit[];
    List <String> carNameInput(){
        System.out.println(CAR_INPUT);
        inputString = scanner.nextLine();
        return (util.splitByDelemeter(inputString, ","));
    }
    void playTimeInput() {
        int cnt;
        while (true){
            System.out.println(CNT);
            cnt = scanner.nextInt();

        }
    }
}

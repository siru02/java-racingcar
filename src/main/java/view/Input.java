package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static final String CAR_INPUT =  "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String CNT = "시도할 회수는 몇회인가요?";
    private static final String CAR_INPUT_ERROR = ",기준으로 3개 입력해야합니다.";
    private static Scanner scanner = new Scanner(System.in);
    String  inputString;
    String  inputStringSplit[];
    void carNameInput(){
        System.out.println(CAR_INPUT);
        while (true){
            inputString = scanner.nextLine();
            inputStringSplit = inputString.split(",");
            if (inputStringSplit.length == 3)
                break;
        }
        System.out.println(CAR_INPUT_ERROR);
    }
    void playTimeInput() {

    }
}

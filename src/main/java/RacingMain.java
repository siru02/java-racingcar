import controller.RacingCarController;
import model.RacingCar;

import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//import org.kokodak.Randoms;
public class RacingMain {

    public static void main(String[] args) throws IOException {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기
        RacingCarController racingCarController = new RacingCarController();
        racingCarController.run();
    }
}

package model;

import java.util.List;

public class RacingCar {
    private static String carName;
    private final int position;
    private int cnt;

    private RacingCar(final String name, final int position) {
        this.carName = name;
        this.position = position;
    }


    public String getName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

}

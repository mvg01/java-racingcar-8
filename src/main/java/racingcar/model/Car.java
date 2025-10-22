package racingcar.model;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return position;
    }

    public void move() {
        if(pickNumberInRange(0,9) >= 4) {
            this.position += 1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ");
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}

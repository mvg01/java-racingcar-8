package racingcar.model;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Move {
    public Move() {
    }
    public void moveCar(Car car) {
        int carDistance = car.getDistance();
        if(pickNumberInRange(0,9) >= 4) {
            car.setDistance(carDistance + 1);
        }
    }
}

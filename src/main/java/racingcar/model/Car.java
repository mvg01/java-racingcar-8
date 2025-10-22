package racingcar.model;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

/**
 * 자동차 객체를 나타내며, 이름과 위치 정보를 가진다.
 */
public class Car {

    private String name;
    private int position;

    /**
     * 자동차 생성자. 이름을 받아 초기 위치 0으로 설정한다.
     */
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

    /**
     * 랜덤 조건을 만족하면 위치를 1만큼 이동(추가)시킨다.
     */
    public void move() {
        if(pickNumberInRange(0,9) >= 4) {
            this.position += 1;
        }
    }

    /**
     * 자동차 정보 문자열 반환. 이름과 위치를 '-' 기호로 표시한다.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ");
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}

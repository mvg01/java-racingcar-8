package racingcar.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 여러 자동차(Car) 객체를 관리하는 클래스.
 */
public class Cars {
    private List<Car> cars;

    /**
     * Cars 클래스를 생성하며 내부 리스트 초기화.
     */
    public Cars() {
        this.cars = new ArrayList<>();
    }

    /**
     * Car 객체를 리스트에 추가.
     */
    public void addCar(Car car) {
        cars.add(car);
    }

    /**
     * 전체 리스트 반환.
     */
    public List<Car> getCars() {
        return cars;
    }

    /**
     * 리스트의 모든 자동차 객체를 이동시킨다.
     */
    public void moveAll() {
        for(int i = 0; i < cars.size(); i++) {
            cars.get(i).move();
        }
    }
}

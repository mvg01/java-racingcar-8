package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;
    public Cars() {
        this.cars = new ArrayList<>();
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public Car getCar(int index) {
        return cars.get(index);
    }
    public List<Car> getCars() {
        return cars;
    }
    public void moveAll() {
        for(int i = 0; i < cars.size(); i++) {
            cars.get(i).move();
        }
    }
}

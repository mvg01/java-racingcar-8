package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Cars cars = new Cars();

    public RacingCarController() {
    }

    public void run() {
        try {
            outputView.printGameStart();
            String players = inputView.readInput();
            String[] playerArray = players.split(",");
            for (int i = 0; i < playerArray.length; i++) {
                if (playerArray[i].length() > 5) {
                    throw new IllegalArgumentException();
                }
                Car car = new Car(playerArray[i]);
                cars.addCar(car);
            }
            outputView.printInputTry();
            int count = Integer.parseInt(inputView.readInput());

            for(int i=0; i<count; i++) {
                cars.moveAll();
                outputView.printCarList(cars.getCars());
            }

            outputView.printGameEnd(cars.getCars());

        } catch(IllegalArgumentException e) {
            throw e;
        }
    }
}

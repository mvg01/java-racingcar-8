package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

/**
 * 경주 자동차 게임의 컨트롤러 클래스.
 * 사용자 입력, 게임 진행, 출력제어를 담당한다.
 */
public class RacingCarController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Cars cars = new Cars();

    public RacingCarController() {
    }

    /**
     * 프로그램 실행 메서드.
     * 입력값 받고 게임 진행, 결과 출력 처리.
     */
    public void run() {
        try {
            outputView.printGameStart();

            String players = inputView.readInput();
            String[] playerArray = players.split(",");

            for (int i = 0; i < playerArray.length; i++) {
                if (playerArray[i].length() > 5) {
                    throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
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
            outputView.printError(e.getMessage());
            throw e;
        }
    }
}

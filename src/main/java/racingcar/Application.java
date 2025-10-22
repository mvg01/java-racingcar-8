package racingcar;

import racingcar.controller.RacingCarController;

/**
 * 애플리케이션 실행 진입점 클래스.
 * RacingCarController를 생성해 경주 프로그램 실행을 시작한다.
 */
public class Application {
    /**
     * 프로그램 실행 시 호출됨.
     */
    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController();
        racingCarController.run();
    }
}

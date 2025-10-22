package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자 입력을 처리하는 클래스입니다.
 */
public class InputView {
    public InputView() {
    }

    /**
     * 사용자로부터 한 줄 입력을 받습니다.
     * @return 입력받은 문자열
     */
    public String readInput() {
        return Console.readLine(); // 한 줄 전체를 String으로 받아옴
    }
}
package racingcar.view;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * 각종 메시지 출력을 담당하는 클래스입니다.
 */
public class OutputView {
    public OutputView() {
    }

    /**
     * 경주 시작 메시지를 출력합니다.
     * 사용자에게 자동차 이름 입력을 요청합니다.
     */
    public void printGameStart() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    /**
     * 시도할 횟수 입력을 요청하는 메시지를 출력합니다.
     */
    public void printInputTry() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    /**
     * 현재 자동차들의 상태를 출력합니다.
     * 각 자동차 이름과 현재 위치에 따른 표시를 출력합니다.
     *
     * @param carList 출력할 자동차 객체들의 리스트
     */
    public void printCarList(List<Car>carList) {
        for(int i=0;i<carList.size();i++) {
            System.out.println(carList.get(i).toString());
        }
        System.out.println();
    }

    /**
     * 경주가 끝난 후 최종 우승자 목록을 출력합니다.
     * 같은 최고 점수를 가진 우승자가 여러 명일 경우 이름들을 쉼표로 연결해 출력합니다.
     *
     * @param carList 자동차들의 리스트
     */
    public void printGameEnd(List<Car>carList) {
        System.out.print("최종 우승자 : ");
        List<String> winnerList = new ArrayList<String>();
        int maxScore = -1;
        for(int i=0;i<carList.size();i++) {
            if(maxScore < carList.get(i).getDistance()) {
                maxScore = carList.get(i).getDistance();
                winnerList.clear();
                winnerList.add(carList.get(i).getName());
            }
            else if(maxScore == carList.get(i).getDistance()) {
                winnerList.add(carList.get(i).getName());
            }
        }
        for(int i=0;i<winnerList.size();i++) {
            if(i!=winnerList.size()-1) {
                System.out.print(winnerList.get(i)+", ");
            }
            else if(i==winnerList.size()-1) {
                System.out.println(winnerList.get(i));
            }
        }
    }
}

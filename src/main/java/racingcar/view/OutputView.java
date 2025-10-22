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

    public void printGameStart() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printInputTry() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void printCarList(List<Car>CarList) {
        for(int i=0;i<CarList.size();i++) {
            System.out.println(CarList.get(i).toString());
        }
        System.out.println();
    }

    public void printGameEnd(List<Car>CarList) {
        System.out.print("최종 우승자 : ");
        List<String> winnerList = new ArrayList<String>();
        int maxScore = -1;
        for(int i=0;i<CarList.size();i++) {
            if(maxScore < CarList.get(i).getDistance()) {
                maxScore = CarList.get(i).getDistance();
                winnerList.clear();
                winnerList.add(CarList.get(i).getName());
            }
            else if(maxScore == CarList.get(i).getDistance()) {
                winnerList.add(CarList.get(i).getName());
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

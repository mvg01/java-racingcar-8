# java-racingcar-precourse 

## ✅ 실행 환경 확인
- [x] Java 버전 21로 실행 확인 (`java -version → 21 출력`)
- [x] IntelliJ/Gradle JVM 모두 21로 설정 (`.\gradlew.bat --version`)
- [ ] `.\gradlew.bat clean test` 실행 시 **BUILD SUCCESSFUL** 확인

## 📦 저장소 준비
- [x] 미션 저장소 포크 및 로컬 클론 완료
- [x] `README.md`에 기능 목록 작성 후 단계별 커밋 계획 세움

## 💾 커밋 운용
- [ ] 기능 단위로 커밋 (feat, fix, refactor 등 **Angular 컨벤션 적용**)
- [ ] 커밋 메시지에 구현 기능을 명확히 서술

## ⚙️ 기능 요구 사항
- [x] 경주할 자동차 이름 입력 (쉼표 `,` 기준으로 구분)
- [x] 자동차 이름은 5자 이하만 가능
- [x] 시도할 횟수 입력받기
- [x] 각 자동차는 무작위 값(0~9) 중 4 이상일 경우 전진
- [x] 전진 결과 출력 형식 준수 (`pobi : ---`)
- [x] n회 시도 후 우승자 출력 (`최종 우승자 : pobi, jun`)
- [x] 복수 우승자 처리 시 쉼표로 구분
- [ ] 잘못된 입력 시 `IllegalArgumentException` 발생 및 프로그램 종료

## 💬 입출력 요구
- [x] 입력 1: 자동차 이름 목록 (예: `pobi,woni,jun`)
- [x] 입력 2: 이동 횟수 (예: `5`)
- [x] 출력 1: 각 회차별 자동차 전진 결과 표시
- [x] 출력 2: 최종 우승자 안내 (`최종 우승자 : pobi, jun`)
- [ ] 예외 발생 시 `[ERROR]`로 시작하는 메시지 출력
- [ ] 출력 형식 정확히 일치해야 함

## 💻 프로그래밍 요구
- [x] 진입점 `Application.main()` 사용
- [x] `build.gradle` 수정 금지, 외부 라이브러리 미사용
- [x] `System.exit()` 호출 금지
- [x] 파일/패키지명 변경 금지
- [ ] 자바 코드 컨벤션 및 네이밍 규칙 준수 (Java Style Guide 기반)
- [ ] 들여쓰기 depth 2 이내 유지
- [ ] 메서드는 한 가지 일만 하도록 분리
- [ ] 삼항 연산자 사용 금지

## 🧩 객체 설계 요구
- [x] `Car` 클래스 사용 — `name`, `position` 필드 유지
- [x] `setPosition()` 사용 없이 동작 구현
- [x] `Cars` 일급 컬렉션 형태로 여러 자동차 관리
- [ ] 캡슐화 및 책임 분리 원칙 적용

## 📚 라이브러리 사용
- [x] 입력: `camp.nextstep.edu.missionutils.Console.readLine()`
- [x] 랜덤값: `camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(0, 9)`
- [x] `Random`, `Scanner` 직접 사용 금지

## 🧪 테스트 실행
- [x] Windows: `gradlew.bat clean test` 실행
- [x] 모든 테스트 성공 시 **0점 방지 (BUILD SUCCESSFUL in 0s 확인)**
- [x] `ApplicationTest` 내 전체 테스트 통과 필수

## 🧠 학습 목표
- [ ] 큰 함수 → 작은 함수로 분리하여 단일 역할 수행
- [ ] `JUnit5` + `AssertJ` 테스트 코드 작성
- [ ] 1주 차 피드백(네이밍, 들여쓰기, 책임 분리 등) 반영
- [ ] 객체지향 설계 및 일급 컬렉션 적용 실습

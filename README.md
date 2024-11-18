# 미션 - 숫자 야구

***

## 1. 미션 소개

이번 미션은 `숫자야구`라는 게임을 프로그램으로 구현하는 것이다. 숫자야구는 1 부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
숫자야구 프로그램은 컴퓨터가 임의의 숫자 세 개를 정한 뒤 사용자가 맞추는 방식으로 진행한다.

***

## 2. 패키지 목록

```agsl
src
    ├───main
    │   └───java
    │       └───baseball
    │           ├───controller
    │           ├───model
    │           ├───validator
    │           └───view
    └───test
        └───java
            └───baseball
```

***

## 3. 기능 목록

- [x] 숫자야구 정답 생성 기능
    - [x] 랜덤 숫자 추출 기능

- [x] 숫자 야구 게임 시작 메세지 출력 기능

- [ ] 사용자 입력 기능
    - [ ] 사용자 숫자 입력 기능
        - [ ] 사용자 숫자 입력 안내 메세지 출력 기능
        - [ ] 사용자 숫자 입력값 유효성 검사 기능
    - [ ] 사용자 재시작/종료 입력 기능
        - [ ] 사용자 재시작/종료 입력 안내 메세지 출력 기능
        - [ ] 사용자 재시작/종료 입력값 유효성 검사 기능


- [ ] 사용자 숫자 입력값을 정답과 비교하는 기능
    - [ ] 스트라이크가 몇 개 있는지 계산하는 기능
    - [ ] 볼이 몇 개 있는지 계산하는 기능
    - [ ] 낫싱인지 아닌지 계산하는 기능
    - [ ] 사용자 입력값과 정답 비교 결과를 출력하는 기능

***

## 4. 예외 목록(`IllegalArgumentException` 발생)

- [ ] 숫자야구의 모든 숫자는 1~9 사이의 서로 다른 숫자가 아닌 상황
- [ ] 사용자가 재시작/종료에 1, 2 이외의 다른 입력값을 넣은 상황

***

## 5. 사용 예제
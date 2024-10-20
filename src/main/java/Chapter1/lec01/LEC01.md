# Lec 01. 코틀린에서 변수를 다루는 방법

## 📌 1. 변수 선언
- 모든 변수는 var / val 을 붙여 주어야 한다.
  - `var` : 변경 가능하다
  - `val` : 변경 불가능하다(read-only)
## 📌 2. 타입 구분
- 타입을 명시적으로 작성하지 않아도, `타입이 추론`된다
- Primitive Type과 Reference Type을 구분하지 않아도 된다.
- Null이 들어갈 수 있는 변수는 타입 뒤에 `?` 를 붙여준다.
- 변수를 선언할 때 `초기화`를 하지 않으면 컴파일 에러가 발생한다.
- 변수를 선언할 때 `초기화를 하지 않아도 되는 경우`는 타입을 명시해 주어야 한다.
  - 아예 다른 타입으로 간주 된다.
- 객체를 인스턴스화 할 때 new를 붙이지 않아야 한다.
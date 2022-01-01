# 자료형 비교, 검사, 변환
- 코틀린의 자료형 변환
  - 기본형을 사용하지 않고 참조형만 사용
  - 서로 다른 자료형은 변환 과정을 거친 후 비교

  ```kotlin
  val a: Int = 1    // 정수형 변수 a를 선언하고 1을 할당
  val b: Double = a // 자료형 불일치 오류 발생
  val c: Int = 1.1  // 자료형 불일치 오류 발생
  ```
  
  - 변환 메서드의 이용 : ```val b: Double = a.toDouble()```
  - 표현식에서 자료형의 자동 변환 : ```val result = 1L + 3  // Long + Int -> result : Long```

- 변한 메서드의 종류
  - ```.tobyte()``` : Byte
  - ```.toLong()``` : Long
  - ```.toShort()``` : Short
  - ```.toFloat()``` : Float
  - ```.toInt()``` : Int
  - ```.toDouble()``` : Double
  - ``.toChar()``` : Char

- 이중 등호(```==```), 삼중 등호(```===```)
  - ```==``` : 값만 비교하는 경우
  - ```===``` : 값과 참조 주소를 비교할 때
  ```kotlin
  val a: Int = 128
  val b: Int = 128
  println(a == b)   // true
  println(a === b)  // true
  ```
  - 참조 주소가 달라지는 경우
  ```kotlin
  val a: Int = 128
  val b: Int? = 128
  println(a == b)   // true
  println(a === b)  // false
  ```

- 이중 등호 비교와 삼중 등호 비교 사용하기
  > 코틀린에서는 참조형으로 선언한 변수의 값이 -128 ~ 127 범위에 있으면 캐시에 그 값을 저장함
  - ![image](https://user-images.githubusercontent.com/49339278/147845178-3db60438-8ae7-4b3c-aea7-c19b1334ed0f.png)

- 구체적으로 명시되지 않은 자료형을 자동 변환
  - 값에 따라 자료형을 결정
  - Number형은 숫자를 저장하기 위한 특수한 자료형으로 스마트 캐스팅됨

- Any
  - 자료형이 정해지지 않은 경우
  - 모든 클래스의 뿌리 - ```Int```나 ```String```은 ```Any```형의 자식 클래스이다.
  - ```Any```는 언제든 필요한 자료형으로 자동 변환 (스마트 캐스트)

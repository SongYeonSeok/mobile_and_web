1. 코틀린?
- 코틀린 : 구글에서 안드로이드를 개발하기 위해 공식언어로 지정된 언어
	- 기존 자바가 가지고 있던 단점들을 많은 부분 해결함
	- 현대 언어의 특징 많이 포함됨
	- 축약된 표현, 멀티 패러다임 언어, 람다식 등 개념을 채택 -> 생산성 높고 다양한 기기로의 개발을 지원함
	- 자바와 100% 호환 -> 자바의 특정 부분을 일부 변경하거나 동시에 같이 사용 가능

2. 공부해야 하는 이유
	- 목적
		- 안드로이드 앱을 만들기 위해
		- iOS 앱을 만들기 위해
		- Node.js로 운영되는 풀스택 웹 솔루션을 만들기 위해
		- 현대적인 언어이자 요즘 뜨는 언어
		- 자바 100% 대체되어서 오래된 자바를 안써도 됨
		- 회사 프로젝트로 사용함
		- 데스크톱(Linux, Windows) 애플리케이션에도 이용하고자 해서
		- 멀티플랫폼 앱을 만들고 싶어서
		- Andriod Things(IoT)에도 사용하기 위해
	
3. 코틀린의 매력은?
	- 자바와 100% 호환됨
		> 코틀린의 특징 : Statically Typed, Introperable, Null Safety, Immutable
		- #1 : Statically Typed : 기본은 정적 타입 언어 -> **자료형에 대한 오류를 미리 잡을 수 있다!**
			- 컴파일 시 변수의 '자료형(Type)'이 결정된다. -> 안전함
			- 정적 타입 (C/C++, Java, Kotlin) vs 동적 타입(Javascript, Python, Objected-C, PHP, ...)
			- 단, Kotlin/JS를 쓸때는 동적 타입 지원을 위해 dynamic 제공
			- 정적 타입의 특징은 자료형을 일일이 작성되어야 한다. 동적 타입은 자료형을 일일이 작성하지 않아도 된다.
				- 하지만 코틀린은 자료형(Type)을 명시하지 않아도 자료형 추론이 가능하다. (type inference)

		- #2 : Introperable : Java와 100% 호환(Kotlin / JVM)
			- 코틀린 컴파일러는 자바 중간코드(ByteCode) 생성
			- 이미 존재하는 자바 라이브러리를 그대로 이용
			- Java와 Kotlin을 섞어서 써도 된다.
		
		- #3 : Null Safety : NPE를 방지할 수 있는 안정성 -> **널 포인터로 인한 프로그램의 중단을 예방할 수 있다.**
			> Kotlin : Free from NPE language
			- Null Pointer Exception - 토니 호어 "Billion Dollar Mistake"
			- 널이 가능한 자료형(Nullable Type)과 불가능한(Non-Null Type) 자료형을 구분한다.
				
				```kotlin
				var a : String? = null
				var b : String = "Hello"
				b = null  // Error
				```

				```kotlin
				// 컴파일 안됨
				var name: String? = null
				var len = name.length // 에러 : null 가능성 있는 경우 length에 접근 불가
				```

				```kotlin
				// 컴파일 가능, 세이프콜(safe call) 사용
				var name: String? = null
				var len = name?.length  // name이 null이 아닐 경우에만 length에 접근
				```
		- #4 : Immutable : 상태를 바꾸지 않는 **불변성** 제공
			- val (Value) = Immutable = Final variable = 할당 후 변경 불가
			- var (Variable) = Mutable = Non-Final variable = 언제든 변경 가능
			- ![image](https://user-images.githubusercontent.com/49339278/135306523-bc93a6eb-6e19-480a-8081-a3b03b7959a6.png)

	- 간결하고 편리한 문법
		> 코틀린의 특징 : Concise, Extension Functions, Functional Programming, Multiplatform
		- #5 : Concise : 코드의 간결성 -> **효율적**
			- 자바처럼 장황하지 않은 깔끔함, 보일러플레이트 코드의 최소화
				```java
				public class Address {
					private String city;
					private Country country;
					
					public Address(String city, Country country) {
						this.city = city;
						this.country = country;
					}
					
					public String getCity() {
						return city;
					}
					
					public void setCity(String city) {
						this.city = city;
					}
					
					public Country getCountry() {
						return country;
					}
					
					public void setCountry(Country country) {
						this.country = country;
					}
				}
				```
				
				```kotlin
				data class Address(var city:String, var country:Country)
				```
				
		- #6 : Extension Functions : 확장 함수
			- 클래스 상속이나 디자인 패턴을 사용하지 않고도 새로운 기능 확장 가능
				- 단, 너무 많이 사용하면 기능들이 남발하게 되므로 가독성이 떨어진다.
				- ![image](https://user-images.githubusercontent.com/49339278/135307907-ec08c2be-ad0e-40cc-8449-cf370ec429b2.png)

		- #7 : Functional Programming : 함수형 프로그래밍 -> **함수형 프로그래밍 & 객체 지향 프로그래밍 가능**
			- 함수의 유기적 연결을 통한 프로그래밍 방식
			- 함수가 일급 객체(First-class citizens)로 사용할 수 있게 된다.
			- 람다(Lambda)식을 통해 선언되지 않고도 익명의 함수기능을 식에 전달할 수 있다.
			- ![image](https://user-images.githubusercontent.com/49339278/135308122-4dc8bb9c-eb28-429a-9432-3122ac1f8c33.png)

		- #8 : Multiplatform = (Kotlin/JVM + Kotlin/Native + Kotlin/JS)
			- iOS : Kotlin/Native
			- Android : Kotlin/JVM
			- Server : Kotlin/JVM
			- Web : Kotlin/JS

* 함수형 프로그래밍(함수를 변수에 저장하거나 함수를 다른 함수의 매개변수로 넘길 수 있음) + 객체 지향 프로그래밍(클래스 사용) = 멀티 패러다임 언어 

* ![부스트코스_코틀린 QnA](https://www.boostcourse.org/mo001/lecture/335711/?isDesc=false#)

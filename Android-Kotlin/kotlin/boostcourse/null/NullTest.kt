fun main() {
    // 코틀린의 변수 선언은 기본적으로 nul을 허용하지 않는다.
    //val a: Int = 30
    //var b: String = "Hello"

    // null 가능한 선언
    //val c: Int? = null
    //var d: String? = null

    var str1: String? = "Hello Kotlin"
    str1 = null
    // println("str1: $str1 length : ${str1.length}")  // null을 허용하면 length가 실행될 수 없음

    // 세이프 콜(Safe-call) : str1?.length
    // non-null 단정 기호 : str!!.length

    // if-else 활용
    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}")

    // 세이프 콜과 엘비스 연산자를 활용해 null을 허용
    // 더 안전하게 사용하는 방법 : str1?.length ?: -1
    println("str1: $str1 length: ${str1?.length ?: -1}")    // 세이프 콜과 엘비스 연산자 활용
}

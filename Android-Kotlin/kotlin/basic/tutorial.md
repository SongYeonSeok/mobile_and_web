# 1. Introduction
  - kotlin (was released in 2016 by JetBrains.)
    1. modern, trending programming language.
    2. easy to learn.
    3. 100% compatible with java.
    
  - Kotlin is used for:
    - Moblie Applications (specially Android Apps)
    - Web development
    - Sever side applications
    - Data Science
    - etc...

  - Why use kotlin?
    - Kotlin is full compatible with Java.
    - Kotlin works on different platforms (windows, mac, linux, Raspberry Pi, etc...)
    - Kotlin is concise and afe
    - easy to learn.
    - Free to use.
    - Big community / Suport.

  - Kotlin Install
    1. Install Java.
      - install zulu sdk
        - [zulu sdk](https://www.azul.com/)
        - [how to install](https://blog.naver.com/picassozin/222354057305)
    2. Install IntelliJ.(IDE)

# 2. Syntax
```kotlin
fun main() {
  println("Hello World")
}
```
- ```fun``` : used to declare a function.
  - A function is a block of code designed to perform a particular task.
  - (in the example...) It declares the ```main()``` functions.

- ```main()``` : **execute** code.
  - Andy code inside the ```main()``` function's curly brackets ```{}``` will be **executed.**
  - executed : 실행

> Good To Know : In kotlin, code statements do not have to end with a semicolon (;)

- Main Parameters
  - Before Kotlin version 1.3, it was required to use the ```main()``` function with parameters, like : ```fun main(arg : Array<String>).```
  - The example above hhad to be written like this to work:
    ```kotlin
    fun main(args : Array<String>) {
        println("Hello World")
    }
    ```
    
- ```println()```, ```print()```
  - ```print()``` function is similar to ```println()```. The only difference is that it does not insert a new line at the end of the output.

# 3. Variables
- To create a variable, use ```var``` or ```val```, and assign a value to it with the equal sign (```=```).
  ```kotlin
  var variableName = value
  val variableName = value
  ```
  
  - example
  ```kotlin
  var name = "John"
  val birthyear = 1975
  
  println(name)
  println(birthyear)
  ```
  
  - The difference between ```var``` and ```val```is that variables declared with the ```var``` keyword **can be changed/modified**, while ```val``` variables **cannot**.
  - Therefore, ```var``` variables can be changed/modified, but ```val``` variables can not be changed/modified.

- Variable Type
  - Unlike many other programming languages, variable in Kotlin do not need to be declared with a specified type.
  - To create a variable in Kotlin that should store text and another that should store a number, look at the following example:
  
  ```Kotlin
  // example.kt
  var name = "John"    // String (text)
  val birthyear = 1975 // Int (number)
  
  println(name)
  println(birthyear)
  ```
  
  - Kotlin is smart enough to understand that "John" is a ```String```(text), and that **1975** is an ```Int``` (number) variable.
  - However, it is possible to specify the type if you instst:
  ```kotlin
  var name: String = "John"  // String
  val birthyear: Int = 1975  // Int
  
  println(name)
  println(birthyear)
  ```
  
  - You can also declare a variable without assign the value, and assign the value later.
  - However, this is only possible when you specify the type:
  - This works fine:
  ```kotlin
  var name: String
  name = "John"
  println(name)
  ```
  
  - This will generate an error:
  ```kotlin
  var name
  name = "John"
  println(name)
  ```
  
- Note on ```val```
  - ```val``` value cannot be changed/reassigned.
  ```kotlin
  val name = "John"
  name = "Robert"  // Error! (use var!)
  println(name)
  ```
  
  - So... The ```val``` keyword is useful when you want a variable to always store the same value, like PI, e, ...

- ```println()``` method can use ```+``` character.
  - ```+``` character use to combine both text and a variagble.
  ```kotlin
  val name = "John"
  println("Hello " + name)
  
  val x = 5
  val y = 6
  println(x + y) // 11
  ```
  
- Variable Names
  - The general rule for Kotlin variables are:
    - Names can contain letters, digits, underscores, and dollar signs.
    - Names should start with a letter.
    - Names can also begin with $ and _.
    - Names are case sensitive. ("myVar" and "myvar" are different variables)
    - Names should start with a lower case letter and it cannot contain whitespace.
    - Reserved Words (ex : var, String) cannot be used as names.
  - (Recommended Notation : camelCase Notation)

# 4. Data Types
```kotlin
val myNum = 5          // Int
val myDoubleNum = 5.99 // Double
val myLetter = 'D'     // Char
val myBoolean = true   // Boolean
val myText = "Hello"   // String
```

- **Integer types** : ```Byte```, ```Short```, ```Int```, ```Long```
  - Byte : -128 ~ 127
    ```kotlin
    val myNum: Byte = 100
    println(myNum)
    ```
  - Short : -32768 ~ 32767
    ```kotlin
    val myNum: Short = 10000
    println(myNum)
    ```
  - Int : -2147483648 ~ 2147483647
    ```kotlin
    val myNum: Int = 100000
    println(myNum)
    ```
  - Long : -9223372036854775808 ~ 9223372036854775808.
    - This is used when ``Int``` is not large enough to store the value.
    - Optionally, you can end the value with an "L"
    ```kotlin
    val myNum: Long = 150000000000L
    println(myNum)
    ```
  
  - Difference Between Int and Long
    - ```Int``` as long as it is up th 2147483647. If it goes beyond that, it is defined as ```Long```
    ```kotlin
    val myNum1 = 2147483647  // Int
    val myNum2 = 2147483648  // Long 
    ```
- **Floating Point types** : ```Float```, ```Double```
  - Float : 3.4e-038 ~ 3.4e+038
    - Note that you should end the value with an "F".
    ```kotlin
    val myNum: Float = 5.75F
    println(myNum)
    ```

  - Double : 1.7e-308 ~ 1.7e+308
    ```kotlin
    val myNum: Double = 19.99
    println(myNum)
    ```
    
> The **precision** of a floating point value indicates how many digits the value can have after the decimal point. The precision of ```Float``` is only six or seven decimal digits, while ```Double``` variables have a precision of about 15 digits.
> Therefore it is safer to use ```Double``` for most calculations.

- Scientific Numbers
  - A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10
  ```kotlin
  val myNum1: Float = 35E3F
  val myNum2: Double = 12E4
  println(myNum1)
  println(myNum2)
  ```

- Booleans : data type and can only take the values of ```true``` or ```false```.
  ```kotlin
  val isKotlinFun: Boolean = true
  val isFishTasty: Boolean = false
  println(isKotlinFun)
  println(isFishTasty)
  ```
  
- Characters : used to store a **single** character.'
> Unlike Java, you cannot use ASCII values to display certain characters.
  ```kotlin
  val myGrade: Char = 'B'
  val myLetter: Char = 66  // Error
  println(myGrade)
  println(myLetter)
  ```
  
- Type Conversion
  - Type conversion is when you convert the value of one data type to another type.
  - In Kotlin, numeric type conversion is different from Java.
  - For example, it is not possible to convert an ```Int``` type to a ```Long``` type with the following code:
    ```kotlin
    val x: Int = 5
    val y: Long = x
    println(y)  // Error : Type mismatch
    ```
  
  - To convert a numeric data type to another type, you must use one of the following functions: ```toByte()```, ```toShort()```, ```toInt()```, ```toLong()```, ```toFloat()```, ```toDouble()``` or ```toChar()```
    ```kotiln
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
    ```
    
# 5. Operators

# 6. Strings

# 7. Booleans

# 8. If-Else

# 9. When

# 10. While + Break/Contiue

# 11. Arrays

# 12. For Loop

# 13. Ranges

# 14. Kotlin Functions

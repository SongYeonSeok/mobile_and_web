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
- Arithmetic Operators : ```+```, ```-```, ```*```, ```/```, ```%```, ```++```, ```--```
- Assignment Operators : ```=```, ```+=```, ```-=```, ```*=```, ```/=```, ```%=```
- Comparison Operators : ```==```, ```!=```, ```>```, ```<```, ```>=```, ```<=```
- Logical Operators : ```&&```, ```||```, ```!```

# 6. Strings
- Kotlin Strings
  - Unlike Java, you do not have to specify that the variable should be a ```String```.
  - Kotlin is smart enough to understand that the greeting variable in the example above is a ```String``` because of the double quotes.
  - However, just like with other data types, you can specify the type if you insist.
  ```kotlin
  var greeting: String = "Hello"
  ```
  - Note: If you want to create a ```String``` without assigning the value (and assign the value later), you must specify the type while declaring the variable:
  ```kotlin
  // This works fine
  var name: String
  name = "John"
  println(name)
  ```
  
  ```kotlin
  // error
  var name
  name = "John"
  println(name)
  ```
  
- Access a String
  - To access the characers (elements) of a string, you must refer to the **index number** inside **square brackets**.
  ```kotlin
  var txt = "Hello World"
  println(txt[0])  // H
  println(txt[2])  // l
  ```
  
- String Length
  - A String in Kotlin is an object, which contain properties and functions that can perform certain operations on string, by writing a dot character(```.```) after the specific string variable.
  - For example, the length of a string can be found with the ```length``` property:
  ```kotlin
  var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  println("The length of the txt string is: " + txt.length)
  ```

- String Functions
  ```kotlin
  var txt = "Hello World"
  println(txt.toUpperCase())  // "HELLO WORLD"
  println(txt.toLowerCase())  // "hello world"
  ```

- Comparing Strings
  - The ```compareTo(string)``` function compares two strings and returns 0 if botu and equal:
  ```kotlin
  var txt1 = "Hello World"
  var txt2 = "Hello World"
  println(txt1.compareTo(txt2))  // 0 (they are equal)
  ```

- Finding a String in a String
  - The ```indexOf()``` function returns the **index** (the position) of the first occurrence of a specified text in a string (including whitespace):
  ```kotlin
  var txt = "Please locate where 'locate' occurs!"
  println(txt.indexOf("locate"))   // Ouputs 7
  ```
  
- Quotes Inside a String
  - To use quotes inside a string, use single quotes (```'```):
  ```kotlin
  var txt1 = "It's alright"
  var txt2 = "That's great"
  ```
  
- Single Concatenation
  - The ```+``` operator can be used between strings to add them together to make a new string. This is called **concatenation**:
  - You can also use the ```plus()``` function to concatenate two strings:
  ```kotlin
  var firstName = "John"
  var lastName = "Doe"
  println(firstName + " " + lastName)
  ```
  
  ```kotlin
  var firstName = "Don "
  var lastName = "Mills"
  println(firstName.plus(lastName))
  ```
  
- String Templates/Interpolation
  - Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.
  - Just refer to the variable with the ```$``` symbol
  ```kotlin
  var firstName = "John"
  var lastName = "Doe"
  prntln("My name is $firstName $lastName")
  ```

> "String Templates" is a popular feature of Kotlin, as it reduces the amout of code. For example, you don't have to specify a whitespace between firstName and lastName, like we did in the concatenation example.

# 7. Booleans
- Booleans : ```true``` of ```false```
  - ```true``` = 1
  - ```false``` = 0

> The Boolean value of an expression is the basis for all Kotlin comparisons and conditions.

# 8. If-Else
```kotlin
if (condition1) {
    // block of code to be executed if the condition1 is true
} else if (condition2) {
    // block of code to be executed if the condition1 is false and condition2 is true
} else {
    // block of code to be executed if the condition1 is false and condition2 is false
}
```

```kotlin
val time = 22
if (time < 10) {
    println("Good morning.")
} else if (time 20) {
    println("Good day.")
} else {
    println("Good evening.")
}
// Good evening
```

- Kotlin if-else Expression
  - In Kotlin, you can also use ```if.. else``` statements as expressions (assign a value to a variable and return it):
  ```kotlin
  val time = 20
  val greeting = if (time < 18) {
      "Good day."
  } else {
      "Good evening."
  }
  println(greeting)
  ```
  
  - you can omit the curly braces ```{}``` when ```if``` has only one statement:
    - omit : 생략, curly braces : 중괄호
  ```kotlin
  fun main() {
      val time = 20
      val greeting = if (time < 18) "Good day." else "Good evening."
      println(greeting)
  }
  ```
# 9. When
- Instead of writing many ```if-else``` expressions, you can use the ```when``` expression, which is much easier to read.
- It is used to select one of many code blocks to be executed:

  ```kotlin
  val day = 4
  
  val result = when (day) {
      1 -> "Monday"
      2 -> "Tuesday"
      3 -> "Wednesday"
      4 -> "Thursday"
      5 -> "Friday"
      6 -> "Saturday"
      7 -> "Sunday"
      else -> "Invalid day."
  }
  println(result)
  ```
> ```when``` expression == ```switch```

- This is how it works:
  - The ```when``` variables is ecaluated once.
  - The value of the **day** variables is compared with the values of each "branch"
  - Each branch starts with a value, followed by an arrow (->) and a result.
  - If there is a match, the associated block of code is executed.
  - ```else``` is used to specify some code to run if there is no match.
  - In the example above, the value of ```day``` is ```4``` meaning "Thursday" will be printed.

# 10. While + Break/Contiue
```kotlin
while (condition) {
    // code block to be executed
    //...
    break
    //...
    continue
    //...
}
```

```kotlin
do {
    // code block to be executed
}
while (condition)
```
# 11. Arrays
- Arrays are used to store multiple values in a single variable, instead of creating seperate variables for each value.
- To create an array, use the ```arrayOf()``` function, and place the values in a comma-separated list inside it:
  ```val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")```
  
- Access the Elements of an Array
  - You can access an array element by referring to the **index number,** inside **square brackets**.
  ```kotlin
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  println(cars[0])
  ```

- Change an Array Element
  - To change the value of a specific element, refer to the index number:
  ```kotlin
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  cars[0] = "Opel"
  println(cars[0])
  ```

- Array Length / Size
  - To find out how many elements an array have, use the ```size``` property.
  ```kotlin
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  println(cars.size)
  ```
  
- Check if an Element Exist
  - You can use the ```in``` operator to check if an element exists in an array:
  ```kotlin
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  if ("Volvo" in cars) {
      println("It exists!")
  } else {
      println("It does not exist.")
  }
  ```

- Loop Through an Array
  - Often when you work with arrays, you need to loop through all of the elements.
  - You can loop through the array elements with the ```for``` loop, which you will learn even more about in the next chapter.
  ```kotlin
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  for (x in cars) {
      println(x)
  }
  ```
# 12. For Loop
- To loop through array elements, use the ```for``` loop together with the ```in``` operator:
  ```kotlin
  val cars = arrayOf(1, 5, 10, 15, 20)
  for (x in nums) {
      println(x)
  }
  ```

- Traditoinal For Loop
  - Unlike Java and other programming languages, there is no traditional ```for``` loop in Kotlin.

# 13. Ranges
- With the ```for``` Loop, you can also create **ranges** of values with ```..```:
  ```kotlin
  for (chars in 'a'..'x') {
      println(chars)
  }
  
  for (nums in 5..15) {
      println(nums)
  }
  ```

- Check if a Value Exists
  - You can also use the ```in``` operator to check if a value exists in a range:
  ```kotlin
  val nums = arrayOf(2, 4, 6, 8)
  if (2 in nums) {
      println("It exists!")
  } else {
      println("It does not exist.")
  }
  
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  if ("Volvo" in cars) {
      println("It exists!")
  } else {
      println("It does not exist.")
  }
  ```

- Break or Continue a Range
  - You can also use the ```break``` and ```continue``` keywords in a range/```for``` loop:
  ```kotlin
  for (nums in 5..15) {
      if (nums == 10) {
          break
      }
      println(nums)
  }
  
  for (nums in 5..15) {
      if (nums == 10) {
          continue
      }
      println(nums)
  }
  ```
# 14. Kotlin Functions
- A **function** is a block of code which only runs when it is called.
- You can pass data, known as parameters, into a function.
- Functions are used to perform certain actions, and they are also known as **methods.**

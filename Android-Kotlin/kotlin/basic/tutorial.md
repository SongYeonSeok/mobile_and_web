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


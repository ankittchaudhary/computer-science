# Java Basics

## Topics Covered

- Introduction
- JVM
- JDK
- JRE
- Variables
- Data Types
- Operators
- Input Output



## What is Java?
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.


## JDK
Java Development Kit (JDK) is a software development environment used for developing Java applications and applets. 
It includes: 
- Java Runtime Environment (JRE), 
- an interpreter/loader (Java), 
- a compiler (javac), 
- an archiver (jar), 
- a documentation generator (Javadoc), and other tools needed for Java development.

![JDK](./images/jdk.png)

```JDK = JRE + Development Tools```

JRE (Java Runtime Environment) provides libraries, *JVM*, and other components to run applications written in Java. It does not contain development tools such as a compiler or debugger.

## JVM
Java Virtual Machine (JVM) enables a computer to run a Java program. It is a part of the Java Runtime Environment (JRE).

```*Java is platform independent but JVM is not.*```


## Interview Questions

Q1. How Java Works?
![How Java Works](./images/how%20Java%20works.png)
- javac compiles the Java source code into bytecode.
- The bytecode is platform-independent and can be executed on any machine that has a JVM.
- The JVM interprets the bytecode and translates it into machine code that can be executed by the host operating system.

---
Q2. What is the difference between JDK, JRE, and JVM?
| JDK | JRE | JVM |
| --- | --- | --- |
| Contains tools for developing Java programs | Provides libraries and other components to run Java applications | Enables a computer to run a Java program |
| Includes JRE | Includes JVM | Part of JRE |

Q3. Explain the concept of platform independence in Java.

Ans: Java is platform-independent because it uses the Java Virtual Machine (JVM) to execute code. When a Java program is compiled, it is converted into bytecode, which can be run on any platform that has a compatible JVM. This means that developers can write code once and run it anywhere without modification.
```
.java file might not work but compiled .class file will work on any platform with JVM. 
```


## References

- Abdul Bari
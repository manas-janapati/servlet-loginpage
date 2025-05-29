# Java Beginner Reference Cheatsheet

This cheatsheet provides a quick reference for beginners learning Java programming. It covers essential syntax, concepts, and examples to help you get started.

## 1. Getting Started
- **File Name**: Must match the public class name with `.java` extension (e.g., `HelloWorld.java`).
- **Compile**: `javac HelloWorld.java` (creates `HelloWorld.class`).
- **Run**: `java HelloWorld` (executes the program).
- **Basic Program Structure**:
  ```java
  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```
  - `public class`: Defines a class.
  - `main`: Entry point of the program.
  - `System.out.println`: Prints to console with a newline.

## 2. Variables and Data Types
- **Primitive Data Types**:
  | Type     | Size       | Description                  | Example           |
  |----------|------------|------------------------------|-------------------|
  | `byte`   | 1 byte     | 8-bit integer (-128 to 127)  | `byte b = 100;`   |
  | `short`  | 2 bytes    | 16-bit integer               | `short s = 1000;` |
  | `int`    | 4 bytes    | 32-bit integer               | `int i = 12345;`  |
  | `long`   | 8 bytes    | 64-bit integer               | `long l = 123L;`  |
  | `float`  | 4 bytes    | 32-bit floating-point        | `float f = 3.14f;`|
  | `double` | 8 bytes    | 64-bit floating-point        | `double d = 3.14;`|
  | `char`   | 2 bytes    | Single Unicode character      | `char c = 'A';`   |
  | `boolean`| 1 bit      | True or false                | `boolean b = true;`|

- **Declaring Variables**:
  ```java
  int age = 25;           // Integer
  double salary = 50000.50; // Floating-point
  char grade = 'A';       // Character
  boolean isActive = true; // Boolean
  ```

- **Non-Primitive Types**:
  - `String`: `String name = "Alice";`
  - Arrays, Classes, Interfaces (covered later).

## 3. Operators
- **Arithmetic**: `+`, `-`, `*`, `/`, `%` (modulus), `++` (increment), `--` (decrement)
  ```java
  int a = 10, b = 3;
  int sum = a + b;      // 13
  int mod = a % b;      // 1
  a++;                  // a = 11
  ```

- **Relational**: `==`, `!=`, `<`, `>`, `<=`, `>=`
  ```java
  boolean isEqual = (a == b); // false
  boolean isGreater = (a > b); // true
  ```

- **Logical**: `&&` (AND), `||` (OR), `!` (NOT)
  ```java
  boolean result = (a > 5 && b < 5); // true
  boolean notTrue = !isEqual;        // true
  ```

- **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
  ```java
  int x = 5;
  x += 3; // x = 8
  ```

- **Bitwise**: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>` (less common for beginners)
- **Ternary**: `condition ? valueIfTrue : valueIfFalse`
  ```java
  int max = (a > b) ? a : b; // max = 10
  ```

## 4. Control Structures
- **If-Else**:
  ```java
  int score = 85;
  if (score >= 90) {
      System.out.println("A");
  } else if (score >= 80) {
      System.out.println("B");
  } else {
      System.out.println("C");
  }
  ```

- **Switch**:
  ```java
  int day = 3;
  switch (day) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      case 3:
          System.out.println("Wednesday");
          break;
      default:
          System.out.println("Invalid day");
  }
  ```

- **Loops**:
  - **For**:
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.println(i); // Prints 0 to 4
    }
    ```
  - **While**:
    ```java
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }
    ```
  - **Do-While**:
    ```java
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);
    ```
  - **For-Each** (for arrays/collections):
    ```java
    int[] numbers = {1, 2, 3};
    for (int num : numbers) {
        System.out.println(num);
    }
    ```

- **Break and Continue**:
  ```java
  for (int i = 0; i < 10; i++) {
      if (i == 5) break;     // Exits loop
      if (i % 2 == 0) continue; // Skips even numbers
      System.out.println(i);
  }
  ```

## 5. Methods
- **Syntax**:
  ```java
  returnType methodName(parameters) {
      // Code
      return value; // If returnType is not void
  }
  ```
- **Example**:
  ```java
  public int add(int a, int b) {
      return a + b;
  }
  // Calling method
  int result = add(5, 3); // result = 8
  ```

- **Static Methods**:
  ```java
  public static void greet() {
      System.out.println("Hello!");
  }
  // Call: ClassName.greet();
  ```

- **Method Overloading**:
  ```java
  public int add(int a, int b) { return a + b; }
  public double add(double a, double b) { return a + b; }
  ```

## 6. Arrays
- **Declaration and Initialization**:
  ```java
  int[] numbers = new int[5]; // Array of size 5
  int[] values = {1, 2, 3, 4, 5}; // Initialized array
  ```

- **Accessing Elements**:
  ```java
  numbers[0] = 10; // Set first element
  int first = numbers[0]; // Get first element
  ```

- **Length**:
  ```java
  int size = numbers.length; // 5
  ```

- **Looping Through Arrays**:
  ```java
  for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
  }
  // Or using for-each
  for (int num : numbers) {
      System.out.println(num);
  }
  ```

- **Multi-Dimensional Arrays**:
  ```java
  int[][] matrix = {{1, 2}, {3, 4}};
  int element = matrix[0][1]; // 2
  ```

## 7. Strings
- **Declaration**:
  ```java
  String str = "Hello, Java!";
  ```

- **Common Methods**:
  | Method                | Description                          | Example                          |
  |-----------------------|--------------------------------------|----------------------------------|
  | `length()`            | Returns string length                | `str.length(); // 11`            |
  | `charAt(int index)`   | Gets char at index                   | `str.charAt(0); // 'H'`          |
  | `substring(int begin, int end)` | Gets substring                | `str.substring(0, 5); // "Hello"`|
  | `toUpperCase()`       | Converts to uppercase                | `str.toUpperCase(); // "HELLO, JAVA!"` |
  | `toLowerCase()`       | Converts to lowercase                | `str.toLowerCase(); // "hello, java!"` |
  | `equals(String s)`    | Compares strings                     | `str.equals("Hello"); // false`  |
  | `contains(CharSequence s)` | Checks if contains substring     | `str.contains("Java"); // true`  |
  | `replace(CharSequence target, CharSequence replacement)` | Replaces substring | `str.replace("Java", "World");` |

- **String Concatenation**:
  ```java
  String first = "Hello";
  String second = "World";
  String result = first + " " + second; // "Hello World"
  ```

- **StringBuilder** (for mutable strings):
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(" World"); // "Hello World"
  String result = sb.toString();
  ```

## 8. Object-Oriented Programming (OOP)
- **Class and Object**:
  ```java
  class Car {
      String brand;
      int speed;
      
      void drive() {
          System.out.println(brand + " is driving at " + speed + " km/h");
      }
  }
  // Creating object
  Car myCar = new Car();
  myCar.brand = "Toyota";
  myCar.speed = 120;
  myCar.drive(); // Toyota is driving at 120 km/h
  ```

- **Constructor**:
  ```java
  class Car {
      String brand;
      int speed;
      
      Car(String brand, int speed) {
          this.brand = brand;
          this.speed = speed;
      }
  }
  Car myCar = new Car("Honda", 100);
  ```

- **Access Modifiers**:
  - `public`: Accessible everywhere.
  - `private`: Accessible only within the class.
  - `protected`: Accessible within package and subclasses.
  - Default (no modifier): Accessible within package.

- **Encapsulation** (Getters/Setters):
  ```java
  class Person {
      private String name;
      
      public String getName() { return name; }
      public void setName(String name) { this.name = name; }
  }
  ```

- **Inheritance**:
  ```java
  class Vehicle {
      void start() { System.out.println("Vehicle started"); }
  }
  class Car extends Vehicle {
      void drive() { System.out.println("Car driving"); }
  }
  Car car = new Car();
  car.start(); // Vehicle started
  car.drive(); // Car driving
  ```

- **Polymorphism**:
  - **Method Overriding**:
    ```java
    class Vehicle {
        void start() { System.out.println("Vehicle started"); }
    }
    class Car extends Vehicle {
        @Override
        void start() { System.out.println("Car started"); }
    }
    ```
  - **Method Overloading**: Same method name, different parameters (see Methods).

- **Abstract Class**:
  ```java
  abstract class Animal {
      abstract void sound();
  }
  class Dog extends Animal {
      void sound() { System.out.println("Woof"); }
  }
  ```

- **Interface**:
  ```java
  interface Drivable {
      void drive();
  }
  class Car implements Drivable {
      public void drive() { System.out.println("Driving"); }
  }
  ```

## 9. Exception Handling
- **Try-Catch**:
  ```java
  try {
      int result = 10 / 0; // Throws ArithmeticException
  } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
  } finally {
      System.out.println("This always executes");
  }
  ```

- **Multiple Catch Blocks**:
  ```java
  try {
      int[] arr = {1, 2};
      System.out.println(arr[3]);
  } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array error: " + e);
  } catch (Exception e) {
      System.out.println("General error: " + e);
  }
  ```

- **Throwing Exceptions**:
  ```java
  public void checkAge(int age) throws IllegalArgumentException {
      if (age < 18) throw new IllegalArgumentException("Age must be 18+");
  }
  ```

- **Custom Exception**:
  ```java
  class MyException extends Exception {
      MyException(String message) { super(message); }
  }
  ```

## 10. File I/O
- **Reading a File** (using `BufferedReader`):
  ```java
  import java.io.BufferedReader;
  import java.io.FileReader;
  
  try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
          System.out.println(line);
      }
  } catch (IOException e) {
      System.out.println("Error: " + e);
  }
  ```

- **Writing to a File** (using `BufferedWriter`):
  ```java
  import java.io.BufferedWriter;
  import java.io.FileWriter;
  
  try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
      bw.write("Hello, Java!");
  } catch (IOException e) {
      System.out.println("Error: " + e);
  }
  ```

## 11. Common Java Libraries
- **Math**:
  ```java
  double sqrt = Math.sqrt(16); // 4.0
  int max = Math.max(5, 10);  // 10
  double pi = Math.PI;        // 3.14159...
  ```

- **Random**:
  ```java
  import java.util.Random;
  Random rand = new Random();
  int num = rand.nextInt(100); // Random int from 0 to 99
  ```

- **Scanner** (for user input):
  ```java
  import java.util.Scanner;
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter name: ");
  String name = scanner.nextLine();
  System.out.print("Enter age: ");
  int age = scanner.nextInt();
  scanner.close();
  ```

## 12. Collections Framework
- **ArrayList**:
  ```java
  import java.util.ArrayList;
  ArrayList<String> list = new ArrayList<>();
  list.add("Apple");
  list.add("Banana");
  System.out.println(list.get(0)); // Apple
  list.remove(1); // Removes Banana
  ```

- **HashMap**:
  ```java
  import java.util.HashMap;
  HashMap<String, Integer> map = new HashMap<>();
  map.put("Alice", 25);
  map.put("Bob", 30);
  System.out.println(map.get("Alice")); // 25
  ```

## 13. Tips for Beginners
- **Use Meaningful Names**: `int studentAge` is better than `int x`.
- **Comment Code**: Use `//` for single-line, `/* */` for multi-line comments.
- **Follow Java Naming Conventions**:
  - Classes: `CamelCase` (e.g., `MyClass`).
  - Methods/Variables: `camelCase` (e.g., `myMethod`).
  - Constants: `UPPER_CASE` (e.g., `MAX_VALUE`).
- **Practice Debugging**: Use `System.out.println` or a debugger to trace issues.
- **Explore Java API**: Check Oracle’s Java documentation for built-in classes/methods.
- **Start Small**: Write simple programs (e.g., calculators) before complex projects.

## 14. Example Program
A simple program combining multiple concepts:
```java
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        
        String grade = calculateGrade(score);
        System.out.println(name + " has grade: " + grade);
        
        scanner.close();
    }
    
    public static String calculateGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else return "D";
    }
}
```

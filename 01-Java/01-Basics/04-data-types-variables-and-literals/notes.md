# Data Types in Java

Java is **statically typed**: every variable must have a type known at compile time. Java data types are divided into:

1. **Primitive types** — store simple values directly.
2. **Reference types** — store references to objects, such as `String`, arrays, classes, and interfaces.

## Primitive data types

| Type | Size | Range / values | Default value (field) | Example |
|---|---:|---|---|---|
| `byte` | 8 bits (1 byte) | -128 to 127 | `0` | `byte age = 25;` |
| `short` | 16 bits (2 bytes) | -32,768 to 32,767 | `0` | `short count = 300;` |
| `int` | 32 bits (4 bytes) | -2³¹ to 2³¹ - 1 | `0` | `int population = 1_000_000;` |
| `long` | 64 bits (8 bytes) | -2⁶³ to 2⁶³ - 1 | `0L` | `long distance = 9_000_000_000L;` |
| `float` | 32 bits (4 bytes) | Approximately 6–7 decimal digits | `0.0f` | `float price = 19.99f;` |
| `double` | 64 bits (8 bytes) | Approximately 15–16 decimal digits | `0.0d` | `double pi = 3.14159;` |
| `char` | 16 bits (2 bytes) | `\u0000` to `\uFFFF` (UTF-16 code unit) | `\u0000` | `char grade = 'A';` |
| `boolean` | JVM-dependent | `true` or `false` | `false` | `boolean active = true;` |

> `boolean` has no formally specified storage size in the Java Language Specification. A `char` is not an 8-bit character; it represents one UTF-16 code unit.

## Reference types

Reference variables point to objects rather than storing the object directly.

```java
String name = "Ankit";
int[] numbers = {1, 2, 3};
DataTypesExample example = new DataTypesExample();
```

Reference variables can contain `null`, which means they do not refer to an object. Calling a method through `null` causes a `NullPointerException`.

## Variables

```java
int score = 90;       // declaration and initialization
final double PI = 3.14159; // constant; cannot be reassigned
var message = "Hello"; // local variable; type inferred as String
```

- **Local variables** must be initialized before use and have no default value.
- **Instance and static fields** receive default values based on their type.
- `final` variables can be assigned only once.
- Variable names use `camelCase`; constants commonly use `UPPER_SNAKE_CASE`.

## Literals

```java
int decimal = 42;
int binary = 0b101010;
int octal = 052;
int hexadecimal = 0x2A;
long largeNumber = 42L;
float decimalNumber = 3.14f;
double scientific = 6.02e23;
char letter = 'J';
char newline = '\n';
String text = "Java";
boolean result = true;
```

Underscores improve readability in numeric literals: `1_000_000`. They cannot be placed at the beginning or end of a number, next to a decimal point, or next to a type suffix.

## Type conversion and casting

Widening conversions are generally automatic because they do not lose range:

```java
int number = 10;
long largerNumber = number;
double decimal = largerNumber;
```

Narrowing conversions require an explicit cast and may lose data:

```java
double value = 10.9;
int whole = (int) value; // 10; fractional part is discarded
```

Arithmetic with `byte`, `short`, and `char` usually promotes operands to `int`:

```java
byte a = 1;
byte b = 2;
byte sum = (byte) (a + b);
```

## Important points

- Integer literals are `int` by default; decimal literals are `double` by default.
- Use `L` for a `long` literal and `f` for a `float` literal.
- Floating-point values can have rounding errors. Use `BigDecimal` for exact decimal calculations such as money.
- Use `.equals()` to compare object contents, such as two `String` values; `==` compares primitive values or reference identity.
- Arrays and objects have a default value of `null` when used as fields.


# Utility convertor ARABIC-ROMAN

This proyect contains an utility developed using java that lets user execute convertion from:

 - Arabic numbers to Roman numerals
 - Roman Numerals to Arabic numbers




## Authors

- Eduardo Hernández Gutiérrez

## Requirements 
#### 1. With any integer, show the roman numeral
#### 2. With any roman numeral, show the integer.

## Previous docuemntation 
To solve this problem it is important to understan how the Roman Numeral work and what are the rules to create then or transform from the Arabic numbers. So, I include the next extracts as a quick reference:

### Basic Symbols And Value

The Roman numeral system is based on a set of symbols that represent specific values. The basic symbols are I, V, X, L, C, D, and M, representing one, five, ten, fifty, one hundred, five hundred, and one thousand, respectively. These symbols are used to represent values from one to 3,999.

### Three rules...
#### Add
When a symbol is placed after (to the right of) a larger value, it is added. For example: XI = 10 + 1 = 11

#### Subtract
When a symbol is placed before (to the left of) a larger value, it is subtracted. For example: XL = 50 − 10 = 40 This way, when a symbol is between two larger numbers, it is subtracted from the symbol on the right. For example: XIX = 10 + (10 − 1) = 19.

#### Large numbers
Any number can be multiplied by 1 000 by drawing a horizontal line above it.

### And three exceptions!
#### Don’t repeat a symbol more than 3 times in a row
There can’t be more than 3 of the same symbol in a row. For example, 4 can’t be written as IIII (IV).

#### Don’t repeat symbols that start with 5
The symbols V, L and D (5, 50 and 500, respectively) cannot be repeated.

#### Not all symbols can be subtracted
Be careful because this is the exception that gives our student most difficulty! Only the symbols I, X and C (1, 10 and 100 respectively) can subtract and can only subtract the 2 symbols that are immediately larger. So, I can only subtract V or X, X can only subtract L or C, and C can only subtract M. That is, there are only 6 possible subtraction combinations: IV = 5 − 1 = 4; IX = 10 − 1 = 9; XL = 50 − 10 = 40; XC = 100 − 10 = 90; CD = 500 − 100 = 400; y CM = 1000 − 100 = 900.

More information can be found on the next links:

- https://www.cuemath.com/numbers/roman-numerals/
- https://www.robinwaite.com/blog/what-are-the-rules-of-roman-numerals
- https://www.github.com/octokatherine
- https://www.math-only-math.com/rules-for-formation-of-roman-numerals.html


## Required tools

| Tool             |  Version                                                            |
| -----------------|  ------------------------------------------------------------------ |
| Java | 1.8 |
| Apache Maven | 3.3.9 + |
| Eclipse/STS IDE (Optional) | 4.18 + |


## Installation

Clone the code from this repository

```bash
  $ git clone https://github.com/lalo9210/TechnicalAssessFMC.git
  cd my-project
```

Run mvn command to clean compile and download dependencies

```bash
  $ mvn clean compile
```
### Project Description
This project has been created using Spring Boot dou to its fast configuration and thinking that in future, the utility could be exposed using APIs and web services or some other technologies, in other hand, the functionality could be shared as a JAR component to be used in some other applications.
## Running Tests

To run tests, run the following command

```bash
  $ mvn test-compile
  $ mvn test
```


## Demo

Inside the project, there is a java class under /assesment/src/main/java/com/fmc/assessment/util/Test.java in which developer can execute the Utility class and validate different results of convertion instead of creating unit tests.


### Usage/Examples

```java
    public static void main(String[] args) {

		System.out.println(RomanNumeralsUtil.romanToArabic("MDCCCXCVIII"));
		System.out.println(RomanNumeralsUtil.arabicToRoman(1898));

	}
```


## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.



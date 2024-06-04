# Fuzz Testing KWIC Program

## Test Environment
- **Operating System**: Windows 10
- **Java Version**: OpenJDK 20
- **Testing Framework**: JUnit 4.12
- **IDE**: IntelliJ IDEA
- **Maven Version**: 3.9.6
- **GitHub Repo** (Private repo at the moment): [Fuzz_Testing_KWIC_Program](https://github.com/manula96/Fuzz_Testing_KWIC_Program.git)

## Codebase

- **src/**: This directory contains the source code for Assignment 2.
- **src/test**: Contains the JUnit test cases and compiled files for both KWIC program and triangle problem.
    - **src/test/java/FuzzTester.java**: Fuzz testing code for the KWIC program along with the UI, random input generation, and test case-based input generation.
    - **src/test/java/KWIC.java**: Compiled source code of the KWIC program.
    - **src/test/java/TriangleFuzzTest.java**: Fuzz test code for the triangle problem.
    - **src/test/java/TriangleFuzzTestWrapperTest.java**: JUnit test initialization is done through this class so that `TriangleFuzzTest.java` can be used as the main class to be executed through JUnit.

## Getting Started

To get started with the project, follow these steps:

1. **Clone this repository to your local machine:**
   git clone https://github.com/manula96/Fuzz_Testing_KWIC_Program.git

### Executing the Fuzz Test Tool:
2.	Navigate to the project directory using the terminal (/src/test/java)
3.	Run the command “java FuzzTester.java” to execute the UI based tool.

### Executing the Fuzz Test for triangle program
4.	We would be using clover for coverage information. Therefore, we will initiate the Junit test with clover integrated.
5.	The following command can be run while the terminal is in the root path / FuzzTesting_Group19
      mvn clean clover:setup test clover:aggregate clover:clover

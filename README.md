# Maven_Code

A Maven + JUnit 5 practice project containing 13 Java programs, each with its own test class.

## Programs included
1. Largest of three numbers
2. Factorial
3. Prime number check
4. Fibonacci sequence
5. Reverse a number
6. Number palindrome
7. Simple interest
8. Student grade
9. Sum of array
10. Maximum in array
11. Count vowels
12. Reverse a string
13. String palindrome

## Run tests
```bash
mvn clean test
```

## Demonstrate a failed build safely
Temporarily change one expected value in a test (for example, in `FactorialTest.java`, change expected `120` to `121`), then run `mvn clean test`. The test should fail. Restore the correct expected value `120` and run `mvn clean test` again to get `BUILD SUCCESS`. Do not commit the intentionally failing test.

## For the exam: keep only one program
Keep the selected program source file and its matching `*Test.java` file. Delete the other 12 source files and their 12 test files. Keep `pom.xml`, `Jenkinsfile`, and this README. Then run `mvn clean test`.

Example: if assigned Factorial, keep:
- `src/main/java/com/example/Factorial.java`
- `src/test/java/com/example/FactorialTest.java`

## Jenkins Pipeline
Create a Pipeline job. Configure Pipeline script from SCM if using GitHub, select Git, enter the repository URL and branch, and set Script Path to `Jenkinsfile`. Ensure the Jenkins agent has Java and Maven installed and available in PATH.

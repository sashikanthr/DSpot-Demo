# DSpot Demo
This is a sample project to demonstrate DSpot, a tool to amplify your test cases.

For more information and different options, you can visit:
[DSpot](https://github.com/STAMP-project/dspot)

This project is the implementation of a Genetic Algorithm to solve Meal Planning, a scheduling problem.

You can import the project to Intellij. Please make sure you have JAVA_HOME and MAVEN_HOME configured.

Play around the sample test cases with a ton of DSpot options that are available.

The options can be replaced something like below in Maven command line.

```
--test-criterion
```
can be passed as
```
-Dtest-criterion
``` 

### Some Commands
To run tests with a selector.
```
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest-criterion=JacocoCoverageSelector
```

To iterate your tests 20 times.
```
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Diteration=20
```

To use amplifiers
```
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Damplifiers=BooleanLiteralAmplifier
```

To use an Input Ampl Distributor
```
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -DinputAmplDistributor=SimpleInputAmplDistributor
```

Please note that the default test selector is PitMutantScoreSelector. 

Combine different options to see how it amplifies your testcase.

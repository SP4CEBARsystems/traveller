# Traveller
CLI Game in Java where each day you have to choose how to make money. It was inspired by the travelling strategies example of the strategy design pattern on refactoring.guru. [The repository is hosted on GitHub here](https://github.com/SP4CEBARsystems/traveller).

## Introduction
This readme document explains the usage of various design patterns from [refactoring.guru](https://refactoring.guru) that are implemented within this program.
### Authors And Workload
All work has been divided equally over... just me. I, Boaz Crezee, made this without a teammate, I hope that is acceptable.

## Design patterns

### Behavioral Patterns

#### Strategy
The strategies live at [src/MoneyStrategies](src/MoneyStrategies). With interface [src/MoneyStrategies/IMakeMoneyStrategy.java](src/MoneyStrategies/IMakeMoneyStrategy.java) and ccontext [src/MoneyStrategies/MoneyContext.java](src/MoneyStrategies/MoneyContext.java)

#### State
_Planned but not implemented._

### Creational Patterns

#### Builder
The builder at [src/UIBuilder.java](src/UIBuilder.java) builds the CLI UI, it lists options that a user can choose from.

#### Singleton
_Planned but not implemented._

### Structural Patterns

#### Adapter
The adapter pattern lives in the package at [src/UserInputAdapter](src/UserInputAdapter).
The adapter at [src/UserInputAdapter/UserInputMenuAdapter.java](src/UserInputAdapter/UserInputMenuAdapter.java) adapts user input from [src/UserInputAdapter/ConsoleReader.java](src/UserInputAdapter/ConsoleReader.java) to a chosen menu item, its client is at [src/Main.java](src/Main.java) and interface is [src/UserInputAdapter/IAmUserInputAdapter.java](src/UserInputAdapter/IAmUserInputAdapter.java).

#### Bridge
_Planned but not implemented._
The bridge will allow ... 
make a cocrete implementation for each location, these will affect all jobs
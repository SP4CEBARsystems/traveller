# Traveller
CLI Game in Java where each day you have to choose how to make money. It was inspired by the travelling strategies example of the strategy design pattern on refactoring.guru. [The repository is hosted on GitHub here](https://github.com/SP4CEBARsystems/traveller).

## Introduction
This readme document explains the usage of various design patterns from [refactoring.guru](https://refactoring.guru) that are implemented within this program.
### Authors 
- Boaz Crezee
- Gijs Borghouts (Has helped me as his second project, very kind of him)

### Cooperation
#### Boaz' Design Patterns
- builder
- adapter
- bridge

#### Gijs' Design Patterns
- strategies
- singleton
- state

## Design 

### Behavioral Patterns

#### Strategy
The strategies live at [src/MoneyStrategies](src/MoneyStrategies). With interface [src/MoneyStrategies/IMakeMoneyStrategy.java](src/MoneyStrategies/IMakeMoneyStrategy.java) and context [src/MoneyStrategies/MoneyContext.java](src/MoneyStrategies/MoneyContext.java). [src/Main.java](src/Main.java) is the Client but is planned to be replaced by JobController.

#### State
State is game state, there are two states: choosing an occupation and working this occupation.

### Creational Patterns

#### Builder
The builder at [src/UIBuilder.java](src/UIBuilder.java) builds the CLI UI, it lists options that a user can choose from, it is controlled by [src/Main.java](src/Main.java).

#### Singleton
The singleton will hold an array of all our different strategies and will help the client with setting a strategy.

### Structural Patterns

#### Adapter
The adapter pattern lives in the package at [src/UserInputAdapter](src/UserInputAdapter).
The adapter at [src/UserInputAdapter/UserInputMenuAdapter.java](src/UserInputAdapter/UserInputMenuAdapter.java) adapts user input from [src/UserInputAdapter/ConsoleReader.java](src/UserInputAdapter/ConsoleReader.java) to a chosen menu item, its client is at [src/Main.java](src/Main.java) and interface is [src/UserInputAdapter/IAmUserInputAdapter.java](src/UserInputAdapter/IAmUserInputAdapter.java).

#### Decorator
The bridge will add a city property to a jobController controlled by Main, the city will affect how much job options are shown, the jobController will control the money Context.
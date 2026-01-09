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
The strategies represent different jobs and will generate what happened after a day of working there.
- Package: [src/MoneyStrategies](src/MoneyStrategies)
- Interface: [src/MoneyStrategies/IMakeMoneyStrategy.java](src/MoneyStrategies/IMakeMoneyStrategy.java)
- context: [src/MoneyStrategies/MoneyContext.java](src/MoneyStrategies/MoneyContext.java)
- Client: [src/GameState/GameContext.java](src/GameState/GameContext.java)

#### State
State is game state, there are two states: choosing an occupation and working this occupation.
- Package: [src/GameState](src/GameState)

### Creational Patterns
#### Builder
The builder builds the CLI UI, it can build statistics to read and a list of options that a user can choose from.
- Package: [src/Builder](src/Builder)
- Builder: [src/Builder/UIBuilder.java](src/Builder/UIBuilder.java)

#### Singleton
The singleton will hold an array of all our different job strategies and will help the client with setting a job strategy.
- Package: [src/StrategySingleton](src/StrategySingleton)

### Structural Patterns
#### Adapter
The adapter adapts user input from the user input (service) to a chosen menu item.
- Package: [src/UserInputAdapter](src/UserInputAdapter)
- Adapter: [src/UserInputAdapter/UserInputMenuAdapter.java](src/UserInputAdapter/UserInputMenuAdapter.java)
- Service: [src/UserInputAdapter/ConsoleReader.java](src/UserInputAdapter/ConsoleReader.java)
- Interface: [src/UserInputAdapter/IAmUserInputAdapter.java](src/UserInputAdapter/IAmUserInputAdapter.java).
- Client: [src/Main.java](src/Main.java)

#### Bridge
The bridge will add a city property to a jobController controlled by Main, the city will affect how much job options are shown, the jobController will control the money Context.
- Package: [src/JobLocationBridge](src/JobLocationBridge)

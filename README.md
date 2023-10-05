# Today

- Control flow / conditionals
- Comparisons
- Randomness

## Recap

- How do I create a new folder in the terminal?
- What kind of variables are there in the args?
    - Strings; the arguments is an array of strings

- What kind of variables are there?
    - Reference object variable
        - String
        - Integer

    - Primitives
        - int
        - double
        - char
        - float
        - boolean
        - short
        - byte
        - long

- What is the Modulo?
    - Remainder of a division
    - Useful for example with "do something for every 5th item on a list"

- Increment/Decrement
  - What does this do `myNumber += 7;`
      - exactly the same as `myNumber = myNumber + 7`
      - A special assignment operator
      - Plus seven to `mynumber`

  - `myNumber++` is an increment, it always adds just 1 to a number
  - [Recap.java](Recap.java)

## Basic control flow

- Who here has any idea what I am talking about when I say "control flow"?
- A program flows from one instruction to the next

    ```
    String name = "Rauli Thunderkitten";        // Executed first
    System.out.println("My cat is " + name);    // Executed second
    System.out.println(name + " is the best");  // Executed third
    ```

- "If statements" is an example of controlling this flow
    - The decision part of a flowchart
    - Also called conditionals (or condition)

- Example: [PetGreeter.java](PetGreeter.java)

## Randomness

- Java has a built-in RNG - Random Number Generator
- Example: [Rando.java](Rando.java)

## Switch & parseint

- Switch statements are an alternative to if statements
- Sometimes we can have a LOT of things to check
    - The switch statement can check one or more conditions
    - It _CAN_ be easier to read
    - Divides opinions

- Example: [MonthChecker.java](MonthChecker.java)
- 
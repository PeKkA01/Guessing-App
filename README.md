# Java Number Guessing Application

## Project Description
The Java Number Guessing Application is a console-based project developed to demonstrate core Java programming concepts through an interactive game. The application generates a random number and allows the player to guess the number within a limited number of attempts while receiving hints and feedback.

This project focuses on clean code structure, object-oriented programming principles, exception handling, file handling, and modular design. It serves as a practical implementation of Java fundamentals used in real-world applications.

---

## Objectives
- To build a structured console-based Java application
- To implement object-oriented programming concepts
- To practice exception handling and input validation
- To implement file handling for persistent data storage
- To design a modular and maintainable codebase

---

## Use Cases Implemented

### UC1: Game Initialization
- Generate a random target number within a defined range
- Initialize maximum attempts and hint limits
- Configure game settings
- Display welcome message and game rules

### UC2: User Guess Submission
- Accept user input from console
- Validate numeric input
- Compare guess with target number
- Track number of attempts
- Provide feedback (higher/lower/correct)

### UC3: Hint Generation
- Provide hints after incorrect guesses
- Limit number of hints available
- Generate meaningful hints (even/odd, range-based)
- Improve gameplay interaction

### UC4: Error Handling and Validation
- Handle invalid or non-numeric input
- Prevent out-of-range guesses
- Implement custom exception handling
- Ensure crash-free and safe execution

### UC5: Game Result Storage
- Store player name, attempts, and result
- Save results in a text file
- Retrieve and display previous game records
- Maintain persistent game history

### UC6: Restart and Exit Functionality
- Provide option to restart the game
- Reset game variables on restart
- Exit application safely
- Ensure proper resource cleanup

---

## Features

### Game Initialization
- Generates a random number within a defined range
- Initializes maximum attempts and hint limits
- Displays game rules and instructions
- Maintains game configuration using encapsulation

### User Guess Submission
- Accepts user input through console
- Validates input and checks guess accuracy
- Provides feedback such as higher or lower
- Tracks number of attempts

### Hint Generation
- Provides hints after incorrect guesses
- Limits number of hints available
- Includes even/odd hints and range-based hints
- Improves user engagement and gameplay experience

### Error Handling and Validation
- Handles invalid and non-numeric input
- Prevents application crashes
- Uses custom exception handling
- Ensures safe and continuous game execution

### Game Result Storage
- Stores player name, attempts, and result in a file
- Maintains persistent game history
- Displays previous game records
- Demonstrates file handling using BufferedReader and BufferedWriter

### Restart and Exit Functionality
- Allows player to restart the game
- Resets game variables on restart
- Provides option to exit the game safely
- Ensures proper resource management

---

## Technologies Used
- Java (Core Java)
- Object-Oriented Programming
- Exception Handling
- File Handling (BufferedReader and BufferedWriter)
- Scanner Class for Input Handling
- Random Class for Number Generation

---

## Project Structure

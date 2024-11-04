# Player Management System

**Course**: ICSI201/IECE201  
**Semester**: Fall 2024  
**Lab Time**: Wendsday  
**Student Name**: David Omotosho  
**Student ID**: DO374676  

## Project Description
This project is a simple game inventory management system built in Java. It reads game character data from a text file, stores the data in an array, and allows users to perform various operations on the data, such as viewing characters sorted by name or power, searching by attack ability, and calculating the total power of all characters. This program is designed to enhance skills in file handling, arrays, classes, and Java methods, as well as reinforce concepts like variable scope and efficient programming style.

## Features
The program provides the following functionality:
1. **Show All Characters Ordered**: Displays all characters sorted alphabetically by name.
2. **Find Characters with Attack Ability**: Finds and displays characters that match a specified attack ability.
3. **Sort Characters by Power**: Shows characters sorted from lowest to highest power.
4. **Calculate Total Power**: Calculates and displays the sum of the power of all characters.
5. **Quit**: Exits the program.

## File Contents

1. **`project2.java`**  
   - The main driver file that contains the main program loop, menu options, and method implementations for reading data from a file and processing user commands.
   - Includes comments and documentation explaining the purpose of each section of code.

2. **`Player.java`**  
   - The `GameCharacter` class file that defines a game character’s attributes and methods.
   - Includes fields such as `name`, `type`, `health`, `power`, and `attackAbility`.
   - Contains methods for accessing and modifying these fields, as well as a `toString` method to provide a formatted character description.

3. **`players.txt`**  
   - A sample text file containing at least 10 records of game characters. Each record includes fields such as `name`, `type`, `health`, `power`, and `attackAbility`, separated by commas.
   - You can modify or replace these records to test the program with different data.

4. **`screenshot.png`**  
   - A screenshot showing the program running with the main menu, sample inputs, and outputs.
   - Demonstrates the functionality of each menu option and confirms correct operation.

## Setup Instructions

1. **Clone or Download** the project files.
2. **Ensure** all files are in the same directory for easy access.
3. **Open the Project** in your IDE (such as Eclipse or IntelliJ).
4. **Modify the file path** for `characters.txt` in `project2.java` if needed, to ensure it points to the correct location of the text file.

## Running the Program

1. **Compile** the program files:
   - Ensure `project2.java` and `Player.java` are compiled successfully without any errors.

2. **Run** the `project2.java` file:
   - The program will display a menu with five options.
   - Choose an option by entering the corresponding number, then press Enter.
   
3. **Menu Options**:
   - **Option 1**: Show all characters sorted alphabetically by name.
   - **Option 2**: Find characters with a specific attack ability. You’ll be prompted to enter an attack ability.
   - **Option 3**: Show characters sorted by power, from lowest to highest.
   - **Option 4**: Calculate and display the total power of all characters.
   - **Option 5**: Quit the program.

4. **Error Handling**:
   - The program checks for invalid inputs and prompts the user to enter a valid choice if an incorrect option is selected.

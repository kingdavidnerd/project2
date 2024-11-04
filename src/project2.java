/*
 * Course: ISCI201/IECE201
 * Semester: Fall 2024
 * Lab Time: Wednesday
 * Student Name: David Omotosho
 * Student ID: Do374676
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * The project2 class represents a program that manages a collection of Player
 * objects, allowing the user to view, sort, search, and calculate data on these
 * characters through a menu-driven interface.
 */
public class project2 {

    /**
     * Main method that initiates the program and handles the user menu.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Player[] players = new Player[100];
        int playerCount = loadPlayersFromFile("players.txt", players);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:*");
            System.out.println("                🧙‍♂️ Character Menu 🧙‍♀️             ");
            System.out.println("✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:*");
            System.out.println();
            System.out.println("1️.  Show characters sorted by name");
            System.out.println("2️.  Find characters by attack ability");
            System.out.println("3️.  Show characters sorted by power");
            System.out.println("4️.  Calculate total power of all characters");
            System.out.println("5️.  🚪 Quit");
            System.out.println();
            System.out.println("✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:*");
            System.out.print("Enter your choice: ");

            // Handle menu choice
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        showPlayersSortedByName(players, playerCount);
                        break;
                    case 2:
                        System.out.print("Enter attack ability to search for: ");
                        String attackAbility = scanner.nextLine();
                        findPlayersByAttackAbility(players, playerCount, attackAbility);
                        break;
                    case 3:
                        showPlayersSortedByPower(players, playerCount);
                        break;
                    case 4:
                        calculateTotalPower(players, playerCount);
                        break;
                    case 5:
                        running = quitProgram();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }

    /**
     * Loads player data from a file and initializes Player objects.
     *
     * @param filename the name of the file containing player data
     * @param players an array to store the loaded players
     * @return the number of players loaded
     */
    // Method to load players from file
    public static int loadPlayersFromFile(String filename, Player[] players) {
        int playerCount = 0;
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            fileScanner.useDelimiter("\n");

            Random random = new Random();

            while (fileScanner.hasNextLine() && playerCount < players.length) {
                String line = fileScanner.nextLine();
                String[] attributes = line.split(",");

                String name = attributes[0];
                char type = attributes[1].charAt(0);
                int health = Integer.parseInt(attributes[2]);
                double power = Double.parseDouble(attributes[3]);
                String attackAbility = attributes[4];

                health += random.nextInt(11) - 5;

                Player player = new Player(name, type, health, power, attackAbility);
                players[playerCount++] = player;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        return playerCount;
    }

    /**
     * Displays players sorted by name.
     *
     * @param players an array of players
     * @param count the number of players
     */
    public static void showPlayersSortedByName(Player[] players, int count) {
        // Create a copy of the array to avoid modifying the original
        Player[] sortedPlayers = new Player[count];
        System.arraycopy(players, 0, sortedPlayers, 0, count);
    
        // Simple bubble sort based on the name
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (sortedPlayers[j].getName().compareTo(sortedPlayers[j + 1].getName()) > 0) {
                    // Swap characters
                    Player temp = sortedPlayers[j];
                    sortedPlayers[j] = sortedPlayers[j + 1];
                    sortedPlayers[j + 1] = temp;
                }
            }
        }
    
        // Display sorted characters
        for (Player character : sortedPlayers) {
            System.out.println(character);
        }
    }

    /**
     * Finds players with a specified attack ability.
     *
     * @param players an array of players
     * @param count the number of players
     * @param attackAbility the attack ability to search for
     */
    public static void findPlayersByAttackAbility(Player[] players, int count, String attackAbility) {
        System.out.println("Players with attack ability \"" + attackAbility + "\":");
        for (int i = 0; i < count; i++) {
            if (players[i].getAttackAbility().equalsIgnoreCase(attackAbility)) {
                System.out.println(players[i]);
            }
        }
    }
    
    /**
     * Displays players sorted by power.
     *
     * @param players an array of players
     * @param count the number of players
     */
    public static void showPlayersSortedByPower(Player[] players, int count) {
        // Create a copy of the array to avoid modifying the original
        Player[] sortedPlayers = new Player[count];
        System.arraycopy(players, 0, sortedPlayers, 0, count);
    
        // Simple bubble sort based on the power attribute
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (sortedPlayers[j].getPower() > sortedPlayers[j + 1].getPower()) {
                    // Swap characters
                    Player temp = sortedPlayers[j];
                    sortedPlayers[j] = sortedPlayers[j + 1];
                    sortedPlayers[j + 1] = temp;
                }
            }
        }
    
        // Display sorted characters
        for (Player player : sortedPlayers) {
            System.out.println(player);
        }
    }

    /**
     * Calculates and displays the total power of all players.
     *
     * @param players an array of players
     * @param count the number of players
     * @return the total power of all players
     */
    public static double calculateTotalPower(Player[] players, int count) {
        double totalPower = 0.0;
        for (int i = 0; i < count; i++) {
            totalPower += players[i].getPower();
        }
        System.out.println("Total power of all characters: " + totalPower);
        return totalPower;
    }
    
    /**
     * Exits the program by updating the running condition to false.
     *
     * @return false to signal the program to stop running
     */
    // Quit method
    public static boolean quitProgram() {
        System.out.println("Exiting program.");
        return false; // Update running condition to false
    }
}



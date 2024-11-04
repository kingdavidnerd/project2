/**
 * The Player class represents a game character with specific attributes like
 * name, type, health, power, and attack ability. It includes methods to retrieve
 * and update these attributes.
 */
public class Player {
    
    private String name;
    private char type;
    private int health;
    private double power;
    private String attackAbility;

    // Constructor
    /**
     * Constructs a new Player instance with the specified attributes.
     *
     * @param name the name of the player
     * @param type the type of the player represented by a character
     * @param health the health value of the player
     * @param power the power level of the player
     * @param attackAbility the special attack ability of the player
     */
    public Player(String name, char type, int health, double power, String attackAbility) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.power = power;
        this.attackAbility = attackAbility;
    }

    // Getters
    /** @return the name of the player */
    public String getName() {
        return name;
    }

    /** @return the type of the player */
    public char getType() {
        return type;
    }

    /** @return the health of the player */
    public int getHealth() {
        return health;
    }

    /** @return the power level of the player */
    public double getPower() {
        return power;
    }

    /** @return the attack ability of the player */
    public String getAttackAbility() {
        return attackAbility;
    }

    // Setters
    /**
     * Sets a new health value for the player.
     *
     * @param health the new health value
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets a new power level for the player.
     *
     * @param power the new power level
     */
    public void setPower(double power) {
        this.power = power;
    }

    // toString method
    /**
     * Returns a string representation of the player's profile, including their
     * name, type, health, power, and attack ability.
     *
     * @return a formatted string representing the player's profile
     */
    @Override
    public String toString() {
    	return "═══════════════════════════════════════════\n" +
    	           "🎮 Player Profile 🎮\n" +
    	           "═══════════════════════════════════════════\n" +
    	           String.format("🧙‍♂️ Name:            %s%n", name) +
    	           String.format("💀 Type:            %c%n", type) +
    	           String.format("❤️ Health:        %d%n", health) +
    	           String.format("⚔️ Power:          %.1f%n", power) +
    	           String.format("🌑 Attack Ability:   %s%n", attackAbility) +
    	           "═══════════════════════════════════════════";
    }
}
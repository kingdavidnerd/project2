public class Player {
    
    private String name;
    private char type;
    private int health;
    private double power;
    private String attackAbility;

    // Constructor
    public Player(String name, char type, int health, double power, String attackAbility) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.power = power;
        this.attackAbility = attackAbility;
    }

    // Getters
    public String getName() {
        return name;
    }

    public char getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public double getPower() {
        return power;
    }

    public String getAttackAbility() {
        return attackAbility;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(double power) {
        this.power = power;
    }

    // toString method
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
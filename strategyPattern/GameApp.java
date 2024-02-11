package strategyPattern;

public class GameApp {
    public static void main(String[] args) {

        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        // Knight attack and defense
        knight.attack();
        System.out.println();
        knight.defend();
        System.out.println();

        // Wizard attack and defense
        wizard.attack();
        System.out.println();
        wizard.defend();
        System.out.println();

        // Archers attack and defense
        archer.attack();
        System.out.println();
        archer.defend();
        System.out.println();
    }
}


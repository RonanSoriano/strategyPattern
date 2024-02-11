package strategyPattern;

public class SwingSword implements AttackStrategy {
    @Override
    public String attack() {
        String output = new String();
        output += " swings a sword!";
        return output;
    }
}

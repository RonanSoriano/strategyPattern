package strategyPattern;

public class ArrowShoot implements AttackStrategy {
    @Override
    public String attack() {
        String output = new String();
        output += " shoots an arrow!";
        return output;
    }
}

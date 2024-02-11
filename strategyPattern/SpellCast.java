package strategyPattern;

public class SpellCast implements AttackStrategy {
    @Override
    public String attack() {
        String output = new String();
        output += " casts a spell!";
        return output;
    }
}

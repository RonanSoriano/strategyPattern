package strategyPattern;

public class ShieldDef implements DefenseStrategy {
    @Override
    public String defend() {
        String output = new String();
        output += " using a shield to defend!";
        return output;
    }
}

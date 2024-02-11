package strategyPattern;

public class DodgeDef implements DefenseStrategy {
    @Override
    public String defend() {
        String output = new String();
        output += " dodges to avoid attack!";
        return output;
    }
}

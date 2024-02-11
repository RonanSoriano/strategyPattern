package strategyPattern;

public class MagicBarrier implements DefenseStrategy {
    @Override
    public String defend() {
        String output = new String();
        output += " creates a magic barrier for defense!";
        return output;
    }
}

package strategyPattern;

public class Knight implements CharacterType {

    SwingSword swingSword = new SwingSword();
    ShieldDef shieldDef = new ShieldDef();
    DodgeDef dodgeDef = new DodgeDef();
    MagicBarrier magicBarrier = new MagicBarrier();


    @Override
    public void attack() {
        String output = new String();
        output += "Knight" + swingSword.attack();
        System.out.println(output);
    }

    @Override
    public void defend() {
        String output = new String();
        output += "Knight" + shieldDef.defend() + "\n";
        output += "Knight" + dodgeDef.defend() + "\n";
        output += "Knight" + magicBarrier.defend();
        System.out.println(output);
    }
}

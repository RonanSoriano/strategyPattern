package strategyPattern;

public class Wizard implements CharacterType {
   SpellCast spellCast = new SpellCast();
   MagicBarrier magicBarrier = new MagicBarrier();


    @Override
    public void attack() {
        String output = new String();
        output += "Wizard" + spellCast.attack();
        System.out.println(output);
    }

    @Override
    public void defend() {
        String output = new String();
        output += "Wizard" + magicBarrier.defend();
        System.out.println(output);
    }
}

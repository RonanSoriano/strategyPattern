package strategyPattern;

public class Archer implements CharacterType {
    ArrowShoot arrowShoot = new ArrowShoot();
    ShieldDef shieldDef = new ShieldDef();


    @Override
    public void attack() {
        String output = new String();
        output += "Archer" + arrowShoot.attack();
        System.out.println(output);
    }

    @Override
    public void defend() {
        String output = new String();
        output += "Archer" + shieldDef.defend() + "\n";
        System.out.println(output);
    }
}
# Problem statement

Suppose we have three types of characters in a GameApp:

<ol>
  <li>Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)</li>
  <li>Wizard: Casts spells; uses magic barrier to defend</li>
  <li>Archer: Shoots arrows; uses dodge to to defend</li>
</ol>

Implement two types of Strategy:
<ol>
  <li>DefenseStrategy
    <ul>
      <li>Shield</li>
      <li>Dodge</li>
      <li>CreateMagic</li>
    </ul>
  </li>
  <li>AttackStrategy
    <ul>
      <li>CastSpell</li>
      <li>ShootArrow</li>
      <li>SwingSword</li>
    </ul>
  </li>
</ol>

Refactor the existing codes and provide the UML Diagram:
<pre><code>
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
            System.out.println("Dodging to avoid attack!");
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!");
        }
    }
}
</code></pre>

# Class Diagram
![Strategy Design Pattern](https://github.com/RonanSoriano/strategyPattern/assets/142371669/3f9def4d-3a1a-43d0-8bd2-fcc13e312de0)

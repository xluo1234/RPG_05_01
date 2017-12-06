//Unsure on how to use super(); completely
public class Assassin extends Protagonist{
	//crit variable
    private double critChance;

	//amplifies damage if Math.random() is lower than the crit chance
    private int dmgAmplify() {
	int dmgAmplify = 0;
	if (critChance <= Math.random()) {
	    dmgAmplify = 2;}
	else {
	    dmgAmplify = 1;}
	return dmgAmplify;
    }
    
	//Assassin constructor
    public Assassin(String aName) {
	super(aName);
	critChance = 0.5;
    }

	//critAttack() gives the chance for an empowered attack
    public int critAttack(Character npc) {
	int damage = (int) (strength * atk * (dmgAmplify())) - npc.getDefense();
	npc.lowerHP(damage);
	return damage;
    }

	//toString for new class
    public String tostring() {
	return "The assassin backstabbed its target for " + super.toString();
    }
    
}

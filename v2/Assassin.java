public class Assassin extends Protagonist{
    private double critChance;

    private int dmgAmplify() {
	int dmgAmplify = 0;
	if (critChance <= Math.random()) {
	    dmgAmplify = 2;}
	else {
	    dmgAmplify = 1;}
	return dmgAmplify;
    }
    
    public Assassin(String aName) {
	super(aName);
	critChance = 0.1;
    }

    public int critAttack(Character npc) {
	int damage = (int) (strength * atk * (dmgAmplify())) - npc.getDefense();
	npc.lowerHP(damage);
	return damage;
    }

    public String tostring() {
	return "The assassin backstabbed its target for " + super.toString();
    }
    
}

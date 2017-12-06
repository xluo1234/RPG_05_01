//Messorem is latin for "Reaper," hence its reap attack
public class Messorem extends Monster {
    //keeps track of the times reap was used
    private int reapUsed;

    //constructor for Messorem
    public Messorem() {
	//low health
	hp = 200;
	//a lot of strength, ranges from 75 to 100
	strength = (int) (Math.random() * 25 + 75);
	//relatively low defense, ranges from 10 to 20
	defense = (int) (Math.random() * 10 + 10);
	//attack multiplier is 0.9, extremely strong
	atk = 0.9;
	//starts off with 3
	reapUsed = 3;
    }

    //special attack: reap
    //this can be used up to 3 times and basically is dependent of a player's defense
    //the more defense a player has, the more damage reap does
    public void reap(Character enemy) {
	if (reapUsed > 0) {
	    System.out.println("Messorem has used Reap alread");}
	else {
	    int damage = (int) strength * atk * enemy.getdefense();
	    enemy.lowerHP(damage);
	    reapUsed--;}
    }

    //toString for this class
    public String toString() {
	return "Messorem speaks an ancient, foreign tongue and seems very strong" + super.toString();
    }
}

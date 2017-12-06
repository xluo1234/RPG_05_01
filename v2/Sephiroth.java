public class Sephiroth extends Monster{
    
    public Sephiroth(){
	hp = 1500;
	strength = (int)( Math.random() * 100) + 20;
	defense = 50;
	atk = 0.7;
    }

    public void Meteor(Character enemy){
	int damage = enemy.hp/2;
	enemy.lowerHP(damage);
    }

    public String toString(){
	return " hp: " + hp + " strength: " + strength + " defense: " + defense + " atk: " + atk; 
    }

  
}

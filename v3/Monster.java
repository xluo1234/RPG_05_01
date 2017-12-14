public class Monster extends Character{
    
    public Monster(){
	hp = 300;
	strength = (int)( Math.random() * 45) + 20;
	defense = 20;
	atk = 0.7;
    }

    public String toString(){
	return " hp: " + hp + " strength: " + strength + " defense: " + defense + " atk: " + atk; 
    }
  
}

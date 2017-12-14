public class Sephiroth extends Monster{
    private Boolean meteorUsed;
    
    public Sephiroth(){
	hp = 1500;
	strength = (int)( Math.random() * 20) + 20;
	defense = 50;
	atk = 0.7;
    }

    public void Meteor(Character enemy){
	if(meteorUsed){System.out.println("you used meteor already");}
	else{
	int damage = enemy.hp/2;
	enemy.lowerHP(damage);
	meteorUsed = true;}
    }

    public String toString(){
	return "Sephiroth is really strong b careful" +  super.toString();
    }

  
}

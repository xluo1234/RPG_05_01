public class Character{

    protected int hp;
    protected int strength;
    protected int defense;
    protected double atk;


    public boolean isAlive(){
	return hp > 0;
    }

    public int getDefense(){
	return defense;
    }


    public void lowerHP(int damage){
	hp -= damage;
    }

    public int attack(Character npc){
       int damage  = (int)(strength * atk) - npc.getDefense();
       npc.lowerHP(damage);
       return damage;
       
    }

  
}

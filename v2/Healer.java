public class Protagonist extends Character{

    private String name;

    public Protagonist(String pname){
	name = pname;
	hp = 125;
	strength = 100;
	defense = 40;
	atk = 0.4;
    }

    public String getName(){
	return name;
    }

 

    public void specialize(){
	defense -= 20;
	atk += .2;
	    
    }

    public void normalize(){
	defense = 40;
	atk = 0.4;
    }
}

public class Healer extends Protagonist{
    private double healing;


    public Healer(String hname){
        super(hname);
	healing = .3;
    }

    public int aid(Protagonist ally){
	int healed = (int)(ally.hp * healing);
	ally.increaseHP(healed);
	return healed;
    }


}

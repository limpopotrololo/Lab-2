package moves;
import ru.ifmo.se.pokemon.*;


public class Crabhammer extends PhysicalMove {
    public Crabhammer(){
        super(Type.WATER, 100.0,90.0);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (Math.random() < att.getStat(Stat.SPEED)/512) {
            return 2.0;
        }
        else {
            return 1.0;
        }
    }
    @Override
    protected String describe(){
        return "мутит Crabhammer";

    }

}

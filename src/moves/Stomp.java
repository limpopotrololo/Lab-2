package moves;
import ru.ifmo.se.pokemon.*;
public class Stomp extends PhysicalMove {
    public Stomp(){
        super(Type.NORMAL, 60.0,100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon poki) {
        if (Math.random()<0.2){
            Effect.flinch(poki);
        }
    }
    @Override
    protected String describe(){
        return "юзает Stomp";

    }
}

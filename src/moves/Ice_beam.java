package moves;

import ru.ifmo.se.pokemon.*;

public class Ice_beam extends SpecialMove {
    public Ice_beam(){
        super(Type.ICE,90.0,100.0);
    }
    protected void applyOppEffects(Pokemon pika) {
        if(Math.random()<0.1 && pika.hasType(Type.ICE) == false){
            Effect.freeze(pika);
        }
    }
    @Override
    protected String describe(){
        return "юзает Ice Beam";

    }
}

package moves;

import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove {
    public Lick(){
        super(Type.GHOST,30.0,100.0);

    }
    @Override
    protected void applyOppEffects(Pokemon poki){
        if (poki.hasType(Type.ELECTRIC) == false && Math.random()<0.3){
            Effect.paralyze(poki);
        }

    }
    @Override
    protected String describe() {
        return "кастует Lick";
    }
}

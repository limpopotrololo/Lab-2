package moves;

import ru.ifmo.se.pokemon.*;

public class Sludge_bomb extends PhysicalMove {
    public Sludge_bomb(){
        super(Type.POISON,90.0,100.0);

    }
    @Override
    protected void applyOppEffects(Pokemon poki){
        if (poki.hasType(Type.POISON) == false && poki.hasType(Type.STEEL) == false && Math.random()<0.3){
            Effect.poison(poki);
        }

    }
    protected String describe() {
        return "кастует Sludge Bomb";
    }
}

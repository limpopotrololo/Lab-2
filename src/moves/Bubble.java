package moves;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble(){
        super(Type.WATER,40.0,100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon poki) {
        if (Math.random() < 0.1) {
            poki.setMod(Stat.SPEED, -1);
        }
    }
    @Override
    protected String describe() {
        return "атакует посредством Bubble";
    }
}

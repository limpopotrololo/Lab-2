package moves;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Energy_Ball extends SpecialMove {
    public Energy_Ball(){
        super(Type.GRASS,90.0,100.0);
    }
    @Override
    protected void applySelfEffects(Pokemon poki) {
        if (Math.random()<0.1) {
            poki.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "использует Energy Ball";

    }
}

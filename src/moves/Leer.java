package moves;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer(){
        super(Type.NORMAL,0.0,100.0);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "использует Leer";
    }
}

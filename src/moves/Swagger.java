package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon poki) {
        poki.setMod(Stat.ATTACK, 2);
        Effect.confuse(poki);
    }

    @Override
    protected String describe() {
        return "применяет Swagger";
    }
}
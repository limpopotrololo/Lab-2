package moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon poki) {
        if (Math.random() < 0.3) {
            Effect.paralyze(poki);
        }
    }

    @Override
    protected String describe() {
        return "играется с Thunder";
    }
}
package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon poki, double damage) {
        Status poki_stat = poki.getCondition();
        if (poki_stat.equals(Status.BURN) || poki_stat.equals(Status.POISON) || poki_stat.equals(Status.PARALYZE)) {
            super.applyOppDamage(poki, damage*2);
        }
        else {
            super.applyOppDamage(poki, damage);
        }
    }

    @Override
    protected String describe() {
        return "кастует Facade";
    }
}
package moves;


import ru.ifmo.se.pokemon.*;

public class Confinde extends StatusMove {
    public Confinde(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void 	applyOppEffects (Pokemon poki){
        poki.setMod(Stat.SPECIAL_ATTACK, -1);
        Effect.confuse(poki);
    }
    @Override
    protected String describe(){
        return "юзает Confinde";

    }
}

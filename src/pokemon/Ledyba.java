package pokemon;

import moves.*;

import ru.ifmo.se.pokemon.*;

public class Ledyba extends Pokemon {
    public Ledyba (String name, int level){

        super(name,level);
        this.setStats(3.0,2.0,2.0,3.0,5.0,4.0);
        this.setMove(new Energy_Ball(), new Sludge_bomb(),new Lick());

    }
}

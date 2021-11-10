package pokemon;

import moves.*;

import ru.ifmo.se.pokemon.*;

public class Ledian extends Ledyba{
    public Ledian (String name, int level){
        super(name, level);
        this.setStats(4.0,3.0,3.0,4.0,7.0,5.0);
        this.addMove(new Thunder());

    }
}

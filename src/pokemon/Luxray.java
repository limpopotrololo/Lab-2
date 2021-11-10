package pokemon;

import ru.ifmo.se.pokemon.*;

import moves.*;


public class Luxray extends Luxio{

    public Luxray(String name, int level) {
        super(name, level);
        this.setStats(5.0,8.0,5.0,6.0,5.0,5.0);
        addMove(new Facade());
    }
}

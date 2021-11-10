package pokemon;

import ru.ifmo.se.pokemon.*;

import moves.*;

public class Luxio extends Shinx {
    public Luxio(String name, int level) {
        super(name, level);
        this.setStats(4.0,5.0,3.0,4.0,3.0,4.0);
        addMove(new Ice_beam());




    }



}

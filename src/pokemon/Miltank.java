package pokemon;

import ru.ifmo.se.pokemon.*;

import moves.*;

public class Miltank extends Pokemon{
    public Miltank (String name, int level){
        super(name,level);
        this.setStats(6.0,5.0,7.0,3.0,5.0,6.0);
        this.setMove(new Crabhammer(), new Stomp(), new Confinde(), new Bubble());

    }

}

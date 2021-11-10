package pokemon;
import java.lang.*;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Shinx extends Pokemon {
    public Shinx(String name, int level){
        super(name,level);
        this.setType(Type.ELECTRIC);
        this.setStats(3.0,4.0,2.0,3.0,2.0,3.0);
        setMove(new Swagger(), new Leer());

    }

}

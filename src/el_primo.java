import ru.ifmo.se.pokemon.*;
import pokemon.*;
public class el_primo {

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Ledian("Hasbik",3));
        b.addAlly(new Miltank("Alan",2));
        b.addAlly(new Shinx("Daur",1));
        b.addFoe(new Ledyba("Abdurozik",3));
        b.addFoe(new Luxio("Jon Snow",1));
        b.addFoe(new Luxray("Triss",2));

        b.go();
    }
}

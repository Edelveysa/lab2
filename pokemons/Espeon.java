package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Espeon extends Eevee{
    public  Espeon(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC);

        setMove(new PsybeamMove());

        double hp = 65,
                attack = 65,
                defense = 60,
                specialAttack = 130,
                specialDefense = 95,
                speed = 110;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

    }

}

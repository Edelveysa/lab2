package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Bellossom extends Gloom{
    public Bellossom(String name, int level){
        super(name, level);
        setType(Type.GRASS);

        setMove(new SweetScentMove());

        double hp = 75,
                attack = 80,
                defense = 95,
                specialAttack = 90,
                specialDefense = 100,
                speed = 50;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setLevel(level >= 21 ? level : 21);


    }
}

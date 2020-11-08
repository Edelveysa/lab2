package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Gloom extends Oddish{
    public  Gloom(String name, int level){
        super(name, level);
        setType(Type.POISON, Type.GRASS);

        setMove(new GigaDrainMove());

        double hp = 60,
                attack = 65,
                defense = 70,
                specialAttack = 85,
                specialDefense = 75,
                speed = 40;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setLevel(level >= 21 ? level : 21);

    }

}

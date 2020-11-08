package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon{
    public Oddish(String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.POISON);

        setMove(new DazzlingGleamMove(), new FacadeMove());

        double hp = 45,
                attack = 50,
                defense = 55,
                specialAttack = 75,
                specialDefense = 65,
                speed = 30;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setLevel(level <= 20 ? level : 20);


    }
}

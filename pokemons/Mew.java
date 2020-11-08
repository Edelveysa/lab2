package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Mew extends Pokemon {
    public Mew(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC);

        setMove(new FireBlastMove(), new FocusBlastMove(), new PsychicMove(), new ThunderboltMove());

        double hp = 100,
                attack = 100,
                defense = 100,
                specialAttack = 100,
                specialDefense = 100,
                speed = 100;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);


    }
}

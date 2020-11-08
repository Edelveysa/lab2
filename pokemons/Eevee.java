package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Eevee extends Pokemon {
    public Eevee(String name, int level){
        super(name, level);
        setType(Type.NORMAL);

        setMove(new ShadowBallMove(), new BabyDollEyesMove(), new RestMove());

        double hp = 55,
                attack = 55,
                defense = 50,
                specialAttack = 45,
                specialDefense = 65,
                speed = 55;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

    }
}

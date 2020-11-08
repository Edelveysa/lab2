package moves;

import ru.ifmo.se.pokemon.*;

public class GigaDrainMove extends SpecialMove{
    public GigaDrainMove(){
        super(Type.GRASS, 75, 100);
    }

    @Override
    protected String describe() {
        return "не успел идеально отразить";
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        //Уменьшает урон соперника в два раза
        v /=2;
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }
}

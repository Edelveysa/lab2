package moves;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleamMove extends SpecialMove{
    public DazzlingGleamMove(){
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected String describe() {
        return "поднял лапу на оппонента";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        //Обычный урон
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }
}

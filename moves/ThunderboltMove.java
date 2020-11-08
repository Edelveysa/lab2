package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderboltMove extends SpecialMove{
    public ThunderboltMove(){
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "достал из потайного кармана электрошокер и использовал его на противнике";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //С вероятностью 10% противник будет парализован
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.PARALYZE));
    }
}

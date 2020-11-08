package moves;

import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove{
    public RestMove(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe() {
        return "решил взять перерыв";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        //Отправляет в сон на 2 хода
        pokemon.setCondition(new Effect().turns(2).condition(Status.SLEEP));
    }
}

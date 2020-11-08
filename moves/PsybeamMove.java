package moves;

import ru.ifmo.se.pokemon.*;

public class PsybeamMove extends SpecialMove{
    public PsybeamMove(){
        super(Type.PSYCHIC, 65, 100);
    }

    @Override
    protected String describe() {
        return "решил рассказать историю своей жизни на 12 серий";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //С вероятностью 10% можно оконфузить противника
        pokemon.confuse();
    }
}

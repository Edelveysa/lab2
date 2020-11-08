package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBallMove extends SpecialMove{
    public ShadowBallMove(){
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected String describe() {
        return "использовал технику теневого клонирования для устрашения противника";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.2).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}

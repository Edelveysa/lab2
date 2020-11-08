package moves;

import ru.ifmo.se.pokemon.*;

public class BabyDollEyesMove extends StatusMove{
    public BabyDollEyesMove(){
        super(Type.FAIRY, 0, 100, 1, 1);
    }

    @Override
    protected String describe() {
        return "состроил милые глазки, поразив сердечко соперника";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Уменьшение атаки на 1 пункт у соперника
        pokemon.addEffect(new Effect().stat(Stat.ATTACK, -1));
    }
}

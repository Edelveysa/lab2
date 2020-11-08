package moves;

import ru.ifmo.se.pokemon.*;

public class FireBlastMove extends SpecialMove {
    public FireBlastMove(){
        super(Type.FIRE, 110, 94);
    }

    @Override
    protected String describe() {
        return ", хоть и с десятого раза, но призвал огонь, поджигая противника";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        // Горение оппонента с вероятностью 10%
        Effect effect = new Effect().chance(0.1);
        effect.burn(pokemon);
    }
}

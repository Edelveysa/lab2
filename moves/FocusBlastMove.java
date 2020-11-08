package moves;

import ru.ifmo.se.pokemon.*;

public class FocusBlastMove extends SpecialMove{
    public FocusBlastMove(){
        super(Type.FIGHTING, 120, 84);
    }

    @Override
    protected String describe() {
        return "встал в героическую позу, тем самым ослабив спецзащиту противника";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Уменьшает противнику спецзащиту с вероятностью 10% на 1 ход
        pokemon.addEffect(new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}

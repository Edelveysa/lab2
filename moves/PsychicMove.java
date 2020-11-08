package moves;

import ru.ifmo.se.pokemon.*;

public class PsychicMove extends SpecialMove{
    public PsychicMove(){
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "использовал свое психологическое оружие - красноречие";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Уменьшает противнику спецзащиту с вероятностью 10% на 1 ход
        pokemon.addEffect(new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}

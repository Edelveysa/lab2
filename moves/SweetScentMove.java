package moves;

import ru.ifmo.se.pokemon.*;

public class SweetScentMove extends StatusMove{
    public SweetScentMove(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "сломал мировоззрение противника, вынуждая задуматься";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Уменьшает уклонение противника на 1 ход
        pokemon.addEffect(new Effect().turns(1).stat(Stat.EVASION, -1));
    }
}

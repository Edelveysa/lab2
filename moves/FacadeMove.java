package moves;

import ru.ifmo.se.pokemon.*;

public class FacadeMove extends PhysicalMove{
    public FacadeMove(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "почувствовал слабость соперника и нанес удар дважды";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        //Если противник горит\парализован\отравлен, то урон удваивается

        switch (pokemon.getCondition()){
            case BURN:
            case PARALYZE:
            case POISON: v *=2;
                         break;

        }

        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }
}

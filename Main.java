import pokemons.*;
import ru.ifmo.se.pokemon.*;

class Main {
    public static void main(String args[]){
        Battle b = new Battle();

        Pokemon mew = new Mew("Бессознательный кот", 24);
        Pokemon gloom = new Gloom("Спокойная сова", 21);
        Pokemon espeon = new Espeon("Ненормальная сова", 29);
        Pokemon bell = new Bellossom("Прыгучая сова", 25);
        Pokemon odd = new Oddish("Высокий кот", 20);
        Pokemon eevee = new Eevee("Вороненок", 24);

        b.addFoe(bell);
        b.addFoe(gloom);
        b.addFoe(espeon);
        b.addAlly(mew);
        b.addAlly(odd);
        b.addAlly(eevee);

        b.go();

    }
}


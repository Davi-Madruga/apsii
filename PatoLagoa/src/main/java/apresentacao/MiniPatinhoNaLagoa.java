package apresentacao;

import patos.Duck;
import patos.MallardDuck;
import quacks.Quack;
import voos.FlyWithWings;

public class MiniPatinhoNaLagoa {

    public static void main(String[] args) {
        FlyWithWings voar = new FlyWithWings();
        Quack som = new Quack();

        Duck pato = new MallardDuck(voar, som);

        pato.exibir();
    }
}

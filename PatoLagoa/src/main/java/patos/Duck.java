package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void exibir(){
        System.out.println("Sou um Pato");
    }
}

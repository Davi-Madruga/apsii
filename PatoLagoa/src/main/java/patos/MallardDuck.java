package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super(flyBehavior,quackBehavior);
    }

    @Override
    public void exibir(){
        System.out.println("Sou um Pato Mallard");
    }
}

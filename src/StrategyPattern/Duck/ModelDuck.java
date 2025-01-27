package StrategyPattern.Duck;

import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a model Duck!!!");
    }
}

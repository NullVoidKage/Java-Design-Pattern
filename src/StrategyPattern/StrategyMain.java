package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.MallardDuck;
import StrategyPattern.Duck.ModelDuck;
import StrategyPattern.Fly.FlyRocketPowered;

public class StrategyMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); //Dynamic
        model.performFly();
        model.display();
    }
}

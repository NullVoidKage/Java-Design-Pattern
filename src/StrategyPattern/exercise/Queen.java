package StrategyPattern.exercise;

import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Quack.Quack;

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new SwordBehavior();
    }

    public void fight() {
        System.out.println("Queen is Fighting");
    }
}

package StrategyPattern.exercise;

public class King extends Character {
    public King() {
        weaponBehavior = new AxeBehavior();
    }

    public void fight() {
        System.out.println("King is Fighting");
    }
}

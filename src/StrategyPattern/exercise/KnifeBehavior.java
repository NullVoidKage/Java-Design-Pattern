package StrategyPattern.exercise;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Knife weapon");
    }
}

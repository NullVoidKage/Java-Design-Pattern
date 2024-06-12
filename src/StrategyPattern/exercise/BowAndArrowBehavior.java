package StrategyPattern.exercise;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow weapon");
    }
}

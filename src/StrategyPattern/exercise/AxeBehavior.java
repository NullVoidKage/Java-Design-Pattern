package StrategyPattern.exercise;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Axe weapon");
    }
}

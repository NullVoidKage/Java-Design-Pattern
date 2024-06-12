package StrategyPattern.exercise;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    public void weapon() {
        weaponBehavior.useWeapon();
    }

    public void fight() {
        System.out.println("Character fighting");
    }
}

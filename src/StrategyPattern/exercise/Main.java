package StrategyPattern.exercise;

public class Main {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();
        queen.weapon();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.weapon();
        queen.fight();

        Character king = new King();
        king.fight();
        king.weapon();
        king.setWeaponBehavior(new KnifeBehavior());
        king.weapon();
        king.fight();
    }
}

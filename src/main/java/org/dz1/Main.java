package org.dz1;

public class Main {
    public static void main(String[] args) {
        BonusService servise = new BonusService();
        int bonus = (int) servise.calculate(5000, true);
        System.out.print(bonus);


    }

}
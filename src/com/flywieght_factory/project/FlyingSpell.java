package com.flywieght_factory.project;

public class FlyingSpell implements Spell {
    private String nameOfSpell = "Flying spell";

    @Override
    public void castSpell(String object) {
        System.out.println("\nTo cast the " + nameOfSpell + " on " + object + ", say LEVITATIUM!\n");
    }
}

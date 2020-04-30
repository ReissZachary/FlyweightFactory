package com.flywieght_factory.project;

public class DoChoresSpell implements Spell {
    private String nameOfSpell = "Do chores spell";

    @Override
    public void castSpell(String object) {
        System.out.println("\nTo cast the " + nameOfSpell + " on " + object + ", say IMLAZYIUM!\n");
    }
}

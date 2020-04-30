package com.flywieght_factory.project;

public class InvisibilitySpell implements Spell {
    private String nameOfSpell = "Invisibility spell";

    @Override
    public void castSpell(String object) {
        System.out.println("\nTo cast the " + nameOfSpell + " on " + object + ", say ISGONEIUM!\n");
    }
}

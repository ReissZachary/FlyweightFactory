package com.flywieght_factory.project;

public class LightSpell implements Spell {
    private String nameOfSpell = "Light spell";

    @Override
    public void castSpell(String object) {
        System.out.println("\nTo cast the " + nameOfSpell + " on " + object + ", say ILLUMINUM!\n");
    }
}

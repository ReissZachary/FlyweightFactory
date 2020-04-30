package com.flywieght_factory.project;

import java.util.HashMap;

public class HealingSpell implements Spell {
    private String nameOfSpell = "Healing spell";

    @Override
    public void castSpell(String object) {
        System.out.println("\nTo cast the " + nameOfSpell + " on " + object + ", say RESTORIUM!\n");
    }
}

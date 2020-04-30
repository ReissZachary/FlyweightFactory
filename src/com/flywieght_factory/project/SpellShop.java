package com.flywieght_factory.project;

import java.util.ArrayList;
import java.util.List;

public class SpellShop {

    private List<Spell> allSpells;
    private int TotalSpells;

    public SpellShop(Integer numFlySpells, Integer numDoChores, Integer numHealing, Integer numLight, Integer numInvisible){
        SpellFactory spellFactory = new SpellFactory();
        allSpells = new ArrayList<Spell>();
        for(int i = 0; i < numFlySpells; i++){
            allSpells.add(spellFactory.generateSpell(SpellType.FLYING));

        }
        for(int i = 0; i < numDoChores; i++){
            allSpells.add(spellFactory.generateSpell(SpellType.DOCHORES));
            TotalSpells++;
        }
        for(int i = 0; i < numHealing; i++){
            allSpells.add(spellFactory.generateSpell(SpellType.HEALING));
            TotalSpells++;
        }
        for(int i = 0; i < numLight; i++){
            allSpells.add(spellFactory.generateSpell(SpellType.LIGHT));
            TotalSpells++;
        }
        for(int i = 0; i < numInvisible; i++){
            allSpells.add(spellFactory.generateSpell(SpellType.INVISIBILITY));
            TotalSpells++;
        }

        System.out.println("\nYour shop is now stocked with:");
        System.out.println("\t" + numFlySpells + " flying spells");
        System.out.println("\t" + numDoChores + " Do-Chores spells");
        System.out.println("\t" + numHealing + " healing spells");
        System.out.println("\t" + numLight + " light spells");
        System.out.println("\t" + numInvisible + " invisibility spells");

    }

    public List<Spell> getAllSpells() {
        return allSpells;
    }

    public int GetTotalSpells() {
        return TotalSpells;
    }
}

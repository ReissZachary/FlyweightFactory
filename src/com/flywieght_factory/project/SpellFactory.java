package com.flywieght_factory.project;

import java.util.EnumMap;
import java.util.Map;

import static com.flywieght_factory.project.SpellType.DOCHORES;

public class SpellFactory implements Factory{

    private final Map<SpellType, Spell> spells;

    public SpellFactory(){
        spells = new EnumMap<>(SpellType.class);
    }

    //DOCHORES, INVISIBILITY, FLYING, HEALING, LIGHT
    @Override
    public Spell generateSpell(SpellType spellType) {
        Spell spell = spells.get(spellType);
        if(spell == null){
            switch (spellType){
                case DOCHORES:
                    spell = new DoChoresSpell();
                    spells.put(spellType, spell);
                    break;
                case INVISIBILITY:
                    spell = new InvisibilitySpell();
                    spells.put(spellType, spell);
                    break;
                case FLYING:
                    spell = new FlyingSpell();
                    spells.put(spellType, spell);
                    break;
                case HEALING:
                    spell = new HealingSpell();
                    spells.put(spellType, spell);
                    break;
                case LIGHT:
                    spell = new LightSpell();
                    spells.put(spellType, spell);
                    break;
                default:
                    System.out.println("Not a valid spell!");
                    break;
            }
        }
        return spell;
    }

    public Map<SpellType, Spell> getSpells() {
        return spells;
    }
}

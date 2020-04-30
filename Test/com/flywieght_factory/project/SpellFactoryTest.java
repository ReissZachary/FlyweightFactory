package com.flywieght_factory.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class SpellFactoryTest {

    @Test
    void RequestFlyingSpellGetFlyingSpell(){
        SpellFactory fac = new SpellFactory();

        fac.generateSpell(SpellType.FLYING);

        assertEquals(true, fac.getSpells().containsKey(SpellType.FLYING));

    }
    @Test
    void RequestDoChoresSpellGetDoChoresSpell(){
        SpellFactory fac = new SpellFactory();

        fac.generateSpell(SpellType.DOCHORES);

        assertEquals(true, fac.getSpells().containsKey(SpellType.DOCHORES));
    }

    @Test
    void RequestHealingSpellGetHealingSpell(){
        SpellFactory fac = new SpellFactory();

        fac.generateSpell(SpellType.HEALING);

        assertEquals(true, fac.getSpells().containsKey(SpellType.HEALING));
    }

    @Test
    void RequestLightSpellGetLightSpell(){
        SpellFactory fac = new SpellFactory();

        fac.generateSpell(SpellType.LIGHT);

        assertEquals(true, fac.getSpells().containsKey(SpellType.LIGHT));
    }

    @Test
    void RequestInvisibilitySpellGetInvisibilitySpell(){
        SpellFactory fac = new SpellFactory();

        fac.generateSpell(SpellType.INVISIBILITY);

        assertEquals(true, fac.getSpells().containsKey(SpellType.INVISIBILITY));
    }

    @Test
    void RequestAllSpellsGetAllSpells(){
        SpellFactory fac = new SpellFactory();

        fac.generateSpell(SpellType.FLYING);
        fac.generateSpell(SpellType.DOCHORES);
        fac.generateSpell(SpellType.HEALING);
        fac.generateSpell(SpellType.LIGHT);
        fac.generateSpell(SpellType.INVISIBILITY);

        assertEquals(true, fac.getSpells().containsKey(SpellType.FLYING));
        assertEquals(true, fac.getSpells().containsKey(SpellType.DOCHORES));
        assertEquals(true, fac.getSpells().containsKey(SpellType.HEALING));
        assertEquals(true, fac.getSpells().containsKey(SpellType.LIGHT));
        assertEquals(true, fac.getSpells().containsKey(SpellType.INVISIBILITY));
    }
}

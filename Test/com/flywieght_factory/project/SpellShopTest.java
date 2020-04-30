package com.flywieght_factory.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellShopTest {

    @Test
    void Make20SpellsGet20Spells() {
        //setup
        SpellShop shop = new SpellShop(4,4,4,4,4);

        assertEquals(20, shop.getAllSpells().size());
    }
}
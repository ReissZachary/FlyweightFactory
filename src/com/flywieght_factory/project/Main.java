package com.flywieght_factory.project;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("******************** SPELL SHOP MAKER ******************");
        System.out.println("********************************************************\n");

        System.out.println("You are a wizard who wants to get into the spell selling business");
        System.out.println("You decide you want to make you our spell shop");
        System.out.println("Let's get making!\n");

        System.out.println("Here is a list of all the spells:");
        for(SpellType spell : EnumSet.allOf(SpellType.class)){
            System.out.println("\t" + spell);
        }

        Scanner chores = new Scanner(System.in);
        int numOfDoChores;
        System.out.print("\nHow many Do-Chores spells do you want in your store? ");
        numOfDoChores = chores.nextInt();

        Scanner invisible = new Scanner(System.in);
        int numOfInvisible;
        System.out.print("\nHow many invisibility spells do you want in your store? ");
        numOfInvisible = invisible.nextInt();

        Scanner flying = new Scanner(System.in);
        int numOfFlying;
        System.out.print("\nHow many flying spells do you want in your store? ");
        numOfFlying = flying.nextInt();

        Scanner heal = new Scanner(System.in);
        int numOfHealling;
        System.out.print("\nHow many healing spells do you want in your store? ");
        numOfHealling = heal.nextInt();

        Scanner light = new Scanner(System.in);
        int numOfLight;
        System.out.print("\nHow many light spells do you want in your store? ");
        numOfLight = light.nextInt();

        SpellShop spellShop = new SpellShop(numOfFlying, numOfDoChores, numOfHealling, numOfLight, numOfInvisible);

        System.out.println("\nNow, lets create some our own to test out!");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Choose which one you want to try:");
            System.out.println("\t1. Flying Spell");
            System.out.println("\t2. Do-Chores spell");
            System.out.println("\t3. Healing Spell");
            System.out.println("\t4. Invisibility Spell");
            System.out.println("\t5. Light Spell");
            System.out.println("\t6. Im done");

            choice = scanner.nextInt();

            Scanner cast = new Scanner(System.in);
            String objectToCastOn;

            switch (choice){
                case 1:
                    System.out.print("What object do you want to cast this spell on? ");
                    objectToCastOn = cast.nextLine();
                    FlyingSpell flyingSpell = new FlyingSpell();
                    flyingSpell.castSpell(objectToCastOn);
                    break;
                case 2:
                    System.out.print("What object do you want to cast this spell on? ");
                    objectToCastOn = cast.nextLine();
                    DoChoresSpell doChoresSpell = new DoChoresSpell();
                    doChoresSpell.castSpell(objectToCastOn);
                    break;
                case 3:
                    System.out.print("What object do you want to cast this spell on? ");
                    objectToCastOn = cast.nextLine();
                    HealingSpell healingSpell = new HealingSpell();
                    healingSpell.castSpell(objectToCastOn);
                    break;
                case 4:
                    System.out.print("What object do you want to cast this spell on? ");
                    objectToCastOn = cast.nextLine();
                    InvisibilitySpell invisibilitySpell = new InvisibilitySpell();
                    invisibilitySpell.castSpell(objectToCastOn);
                    break;
                case 5:
                    System.out.print("What object do you want to cast this spell on? ");
                    objectToCastOn = cast.nextLine();
                    LightSpell lightSpell = new LightSpell();
                    lightSpell.castSpell(objectToCastOn);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("That is an invalid choice! ");
                    break;
            }
        }
        while (choice < 5);
    }
}

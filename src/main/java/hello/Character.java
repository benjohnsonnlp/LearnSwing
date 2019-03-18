package hello;

import org.springframework.data.annotation.Id;

import java.util.Random;

public class Character {
    @Id
    public String id;

    public String name;
    public int strength;
    public int dexterity;
    public int charisma;
    public int wisdom;
    public int intelligence;
    public int constitution;

    public Character() {
    }

    public Character(String name) {
        this.name = name;

        this.strength = roll(3, 6);
        this.dexterity = roll(3, 6);
        this.charisma = roll(3, 6);
        this.wisdom = roll(3, 6);
        this.intelligence = roll(3, 6);
        this.constitution = roll(3, 6);
    }

    public Character(String name, int strength, int dexterity, int charisma, int wisdom, int intelligence, int constitution) {
        this.name = name;

        this.strength = strength;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.constitution = constitution;
    }

    public static int roll(int numDice, int numFaces) {
        Random rand = new Random();
        return rand.nextInt(numDice * numFaces) + numDice;
    }

    @Override
    public String toString() {
        return String.format("Character[id=%s, name=%s]", id, name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
}

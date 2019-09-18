package com.enigma.model;

public class Heroes extends Affected implements Offensive{

    private Integer hp;
    private Integer mana;
    private Integer baseDamage;
    private Skills skills1;

    public Heroes(Integer hp, Integer mana, Integer baseDamage, Skills skills1) {
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
        this.skills1 = skills1;
    }

    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.baseDamage);
    }

    @Override
    public void getHit(Integer damage) {
        this.hp -= damage;
    }

    public void castSkills(Affected affected){
        skills1.castSkill(affected);
        skills1.decreaseMana(this);
    }

    public void decreaseMana(Integer mana){
        this.mana -= mana;
    }

    public String print() {
        return "Heroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                ", skills1=" + skills1.skillName +
                '}';
    }
}

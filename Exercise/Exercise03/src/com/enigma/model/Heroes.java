
package com.enigma.model;

public class Heroes implements HitAble, Offensive {
    private Integer hp;
    private Integer mana;
    private Integer baseDamage;

    public Heroes(Integer hp, Integer mana, Integer baseDamage) {
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
    }

    public void attack(HitAble hitAble) {
        hitAble.getHit(this.baseDamage);
    }

    public void castSkill(HitAble hitAble) {
        hitAble.getSKilled(this.baseDamage);
    }

    public void getSKilled(Integer damage) {
        this.hp = this.hp - damage;
    }

    public void getHit(Integer damage) {
        this.hp = this.hp - damage;
    }

    public String print() {
        return "Heroes{hp=" + this.hp + ", mana=" + this.mana + ", baseDamage=" + this.baseDamage + '}';
    }
}

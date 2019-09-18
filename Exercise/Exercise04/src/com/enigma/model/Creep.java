package com.enigma.model;

public class Creep extends Affected implements Offensive{
    private Integer hp;
    private Integer baseDamage;

    public Creep(Integer hp, Integer baseDamage){
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    @Override
    public void castSkil(Affected affected, Integer damage) {
        super.castSkil(affected, damage);
    }

    @Override
    public void getHit(Integer damage) {
        this.hp -= damage;
    }

    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.baseDamage);
    }

    public String print() {
        return "Creep{" +
                "hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }
}

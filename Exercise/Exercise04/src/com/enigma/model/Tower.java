package com.enigma.model;

public class Tower implements HitAble, Offensive {
    Integer hp;
    Integer baseDamage;

    public Tower(Integer hp, Integer baseDamage){
        this.hp = hp;
        this.baseDamage = baseDamage;
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
        return "Tower{" +
                "hp=" + hp +
                '}';
    }
}

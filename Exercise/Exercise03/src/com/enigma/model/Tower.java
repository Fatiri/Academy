
package com.enigma.model;

public class Tower implements HitAble {
    Integer hp;

    public Tower(Integer hp) {
        this.hp = hp;
    }

    public void getSKilled(Integer damage) {
        this.hp = -damage;
    }

    public void getHit(Integer damage) {
        this.hp = this.hp - damage;
    }

    public String print() {
        return "Tower{hp=" + this.hp + '}';
    }
}

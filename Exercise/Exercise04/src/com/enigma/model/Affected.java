package com.enigma.model;

public abstract class Affected implements HitAble{

    public void castSkil(Affected affected, Integer damage){
        affected.getHit(damage);
    }
}

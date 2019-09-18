package com.enigma.model;

public class Skills {
    protected String skillName;
    private Integer manaCost;
    private Integer damage;

    public Skills(String skillName, Integer manaCost, Integer damage){
        this.skillName = skillName;
        this.manaCost = manaCost;
        this.damage = damage;
    }

    public void castSkill(Affected affected){
        affected.castSkil(affected, this.damage);
    }

    public void decreaseMana(Heroes heroes){
        heroes.decreaseMana(this.manaCost);
    }
}

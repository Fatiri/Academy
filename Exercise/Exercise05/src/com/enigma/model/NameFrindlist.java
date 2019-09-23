package com.enigma.model;

import java.util.Objects;

public class NameFrindlist {
    public String nm;
    public NameFrindlist(String nm) {
        this.nm = nm;
    }

    public String setName(int i) {
        return nm;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameFrindlist that = (NameFrindlist) o;
        return Objects.equals(nm, that.nm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nm);
    }

    public String setName() {
        return nm;
    }
}

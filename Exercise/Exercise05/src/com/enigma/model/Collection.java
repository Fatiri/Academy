package com.enigma.model;

import java.util.Objects;

public class Collection {
    public Integer r;


    public Collection(Integer r) {
        this.r =r;

    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return Objects.equals(r, that.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}

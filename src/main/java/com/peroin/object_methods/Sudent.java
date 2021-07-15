package com.peroin.object_methods;

import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
public class Sudent {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sudent sudent = (Sudent) o;
        return age == sudent.age &&
                Objects.equals(name, sudent.name);
    }

    @Override
    public int hashCode() {
            return Objects.hash(name, age);
    }
}

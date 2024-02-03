package by.teachmeskills.lesson_12.task4ver2;

import java.util.Objects;

import static java.util.Objects.hash;

public class Passport {
    final private String id;

    public Passport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PassID " + id;
    }

    @Override
    public boolean equals(Object obj) {
        return getId().equals(((Passport) obj).getId());
    }

    @Override
    public int hashCode() {
        return hash(id);
    }
}

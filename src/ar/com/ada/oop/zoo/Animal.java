package ar.com.ada.oop.zoo;

import java.util.Objects;

public class Animal {
    private String breed;

    public Animal () {}
    public Animal (String pBreed) {
        this.breed = pBreed;
    }
    public String getBreed () {
        return this.breed;
    }
    public void setBreed (String pBreed) {
        this.breed = pBreed;
    }
    @Override
    public String toString () {
        return "Animal breed: " +getBreed();
    }
    @Override
    public int hashCode () {
        return -33* Objects.hash(getBreed());
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Animal that = (Animal) o;
        return this.hashCode() == that.hashCode();
    }
}

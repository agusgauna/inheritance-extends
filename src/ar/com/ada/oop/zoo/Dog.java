package ar.com.ada.oop.zoo;

import java.util.Objects;

public class Dog extends Animal {
    private Integer legs;
    private Integer age;

    public Dog () {}
    public Dog (String pBreed, Integer pLegs, Integer pAge) {
        super(pBreed);
        this.legs = pLegs;
        this.age = pAge;
    }
    public Integer getLegs () {
        return this.legs;
    }
    public void setLegs (Integer pLegs) {
        this.legs = pLegs;
    }
    public Integer getAge () {
        return this.age;
    }
    public void setAge (Integer pAge) {
        this.age = pAge;
    }
    @Override
    public String toString () {
        return "Dog legs: " +getLegs()+ "Dog age: " +getAge();
    }
    @Override
    public int hashCode () {
        return -33* Objects.hash(getBreed(), legs, age);
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Dog that = (Dog) o ;
        return this.hashCode() == that.hashCode();
    }
}

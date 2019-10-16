package ar.com.ada.oop.zoo;

import java.util.Objects;

public class Horse extends Animal {
    private String name;
    private Integer power;

    public Horse () {}
    public Horse (String pBreed, String pName, Integer pPower) {
        super(pBreed);
        this.name = pName;
        this.power = pPower;
    }
    public String getName () {
        return this.name;
    }
    public void setName (String pName) {
        this.name = pName;
    }
    public Integer getPower () {
        return this.power;
    }
    public void setPower (Integer pPower) {
        this.power = pPower;
    }
    @Override
    public String toString () {
        return "Horse: " +getName()+ " .Horse power: " +getPower();
    }
    @Override
    public int hashCode () {
        return -33 * Objects.hash(getBreed(), power, name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false ;
        Horse that = (Horse) o;
        return this.hashCode() == that.hashCode();
    }

}

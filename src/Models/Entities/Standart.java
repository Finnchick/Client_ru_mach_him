package Models.Entities;

import java.util.HashSet;
import java.util.Set;

public class Standart {
    private int Id;
    private String Name;
    private int Strength;
    private int Weight;
    private int Size;
    private int Thickness;
    private int Appearance;
    private Set<Produce> Produces = new HashSet<Produce>(0);

    public Standart(int id, int strength, int weight, int size, int thickness, int appearance, String name) {
        Id = id;
        Strength = strength;
        Weight = weight;
        Size = size;
        Thickness = thickness;
        Appearance = appearance;
        Name = name;
    }
    public Standart(int id){
        Id = id;
    }
    public Standart() {

    }

    public int getAppearance() {
        return Appearance;
    }

    public void setAppearance(int appearance) {
        Appearance = appearance;
    }

    public int getThickness() {
        return Thickness;
    }

    public void setThickness(int thickness) {
        Thickness = thickness;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Set<Produce> getProduces() {
        return Produces;
    }

    public void setProduces(Set<Produce> Produces) {
        this.Produces = Produces;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}


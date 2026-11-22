package edu.zuj.oop.week7.lecture2;

public class Engine {
 
 private int cylinders;
 private int capacity;
 private int hp;

    public Engine() {
    }

    public Engine(int cylinders, int capacity, int hp) {
        this.cylinders = cylinders;
        this.capacity = capacity;
        this.hp = hp;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engine{" + "cylinders = " + cylinders + ", capacity = " + capacity + ", hp = " + hp + '}';
    }
 
 
    
}

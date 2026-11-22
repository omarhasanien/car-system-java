package edu.zuj.oop.week7.lecture2;

public class Gearbox {
    private boolean automatic;
    private int gearcount;

    public Gearbox() {
    }

    public Gearbox(boolean automatic, int gearcount) {
        this.automatic = automatic;
        this.gearcount = gearcount;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public int getGearcount() {
        return gearcount;
    }

    public void setGearcount(int gearcount) {
        this.gearcount = gearcount;
    }

    @Override
    public String toString() {
        return "Gearbox{" + "automatic = " + automatic + ", gearcount = " + gearcount + '}';
    }
    
    
    
}

package edu.zuj.oop.week7.lecture2;

public class cartest {
    
    public static void main(String[] args) {
        
     Gearbox g1 = new Gearbox(true, 7);
     Engine e1 = new Engine(4, 2400, 309);
     
     Car c1 = new Car();
     c1.setType("Ford/mustang");
     c1.setYear(2015);
     c1.setColor(" Black ");
     c1.setEngine(e1);
     c1.setGearbox(g1);
     
        System.out.println(c1);
        
                
        
                
                
    }
    
}

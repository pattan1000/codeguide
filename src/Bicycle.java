
public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
    //TODO Please complete this method     
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        
    }
        
    public int getCadence() {
        return cadence;
    }
    //TODO Please complete this method and explain how does it work.    
    public void setCadence(int newValue) {
       
    }
        
    public int getGear() {
        return gear;
    }
    //TODO Please complete this method and explain how does it work.    
    public void setGear(int newValue) {
        
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
package oocminihw2;


public interface Drivable {
    public void accelerate(float speed);
    public void brake();
    public void turn(float angle);
    public float getDirection(); 
    public float getSpeed();   
    public String getMake();    
    public String getType();
       
}


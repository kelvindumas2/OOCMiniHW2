/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

public class Car extends Vehicle implements Drivable {
    public Car(String make, String type, int numWheels) {
        this.make = make;
        this.type = type;
        this.numWheels = numWheels;
    }

    @Override
    public void accelerate(float speed) {
        this.speed = speed;
        System.out.println("Car is accelerating at " + speed + " mph.");
        
   
 
    }

    @Override
    public void brake() {
  
        this.speed = 0;
        System.out.println("Car is braking.");
    }
    

    @Override
    public void turn(float angle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

      @Override
    public String getType() {
        return type;
    }

    }

        
    
  


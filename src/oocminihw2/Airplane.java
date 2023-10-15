/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author kelvi
 */
public class Airplane extends Vehicle implements Flyable {
    private float altitude = 0;

    @Override
    public void accelerate(float speed) {
        this.speed = speed;
        System.out.println("Airplane is accelerating at " + speed + " knots.");
    }

    @Override
    public void brake() {
        this.speed = 0;
        System.out.println("Airplane is braking.");
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
        System.out.println("Airplane is turning to direction " + direction + " degrees.");
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

    @Override
    public void changeAltitude(float change) {
        altitude += change;
        System.out.println("Airplane changes altitude to " + altitude + " feet.");
    }

    @Override
    public float getAltitude() {
        return altitude;
    }
}
    


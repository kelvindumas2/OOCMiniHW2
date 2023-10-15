/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Car car = new Car("Toyota", "Sedan", 4);
        Sailboat sailboat = new Sailboat();
        Airplane airplane = new Airplane();

        car.accelerate(60);
        sailboat.hoistSail();
        airplane.changeAltitude(10000);
        
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author kelvi
 */
public class Sailboat implements Sailable {
    private boolean sailHoisted = false;

    @Override
    public void hoistSail() {
        sailHoisted = true;
        System.out.println("Sailboat hoists the sail.");
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
        System.out.println("Sailboat lowers the sail.");
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    @Override
    public void landHo() {
        System.out.println("Sailboat lands ho.");
    }
}
    

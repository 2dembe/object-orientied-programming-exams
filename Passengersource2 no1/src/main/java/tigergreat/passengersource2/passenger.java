/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tigergreat.passengersource2;

/**
 *
 * @author AM I
 */
public class passenger {
    public class Passenger {
    private String id; 

    public Passenger(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Passenger ID: " + id;
    }
}
    
}

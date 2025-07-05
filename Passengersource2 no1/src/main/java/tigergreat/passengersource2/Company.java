/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tigergreat.passengersource2;

/**
 *
 * @author AM I
 */
 import java.util.Random;

public class Company {
    private String name;
    private Random random; // For simulating success/failure

    public Company(String name) {
        this.name = name;
        this.random = new Random();
        System.out.println(name + " company is ready for business.");
    }

    public String getName() {
        return name;
    }
    
}

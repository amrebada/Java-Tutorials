/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.generics;

/**
 *
 * @author AmrvEbada  
 */
public class Car extends Transport{

    public Car(String name) {
        super.setName(name);
        super.setEngineType("Diesel");
        super.setNumberOfWheels(4);
        
    }
    
}

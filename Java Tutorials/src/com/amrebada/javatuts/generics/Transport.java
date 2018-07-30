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
public abstract class Transport {

    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numberOfWheels
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * @param numberOfWheels the numberOfWheels to set
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * @return the engineType
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * @param engineType the engineType to set
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    private String name;
    private int numberOfWheels;
    private String engineType;
}

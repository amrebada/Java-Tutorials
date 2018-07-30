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
public class GenericMain {

    public static void main(String[] args) {
        //Cars Type
        Car hyundai = new Car("Hyundai");
        Car ford = new Car("Ford");
        
        
        //air planes
        airplane boeing = new airplane("Boeing");
        airplane airbus = new airplane("Airbus");
        
        TransportOrganizer<Car> taxi = new TransportOrganizer<>("Taxi");
        taxi.addTransport(hyundai);
        taxi.addTransport(ford);
        
        TransportOrganizer<airplane> airEntertainment = new TransportOrganizer<>("Air Entertainment");
        airEntertainment.addTransport(boeing);
        airEntertainment.addTransport(airbus);
        
        
        taxi.printTransports();
        airEntertainment.printTransports();
    }
}

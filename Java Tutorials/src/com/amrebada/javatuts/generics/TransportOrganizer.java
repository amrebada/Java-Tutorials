/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.generics;

import java.util.ArrayList;

/**
 *
 * @author AmrvEbada  
 */
public class TransportOrganizer<T extends Transport> {

    ArrayList<T> transports = new ArrayList<T>();

    private String name;

    public TransportOrganizer(String name) {
        this.name = name;
    }

    public void addTransport(T transport) {
        transports.add(transport);
        System.out.println(transport.getName() + " has been add");
    }

    public void printTransports() {
        System.out.println(">> Organizer " + name);
        for (T transport : transports) {
            System.out.println("- " + transport.getName() + " has " + transport.getNumberOfWheels() + " wheels with " + transport.getEngineType() + " Engine");
        }
    }

}

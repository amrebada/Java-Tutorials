/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.generics;

/**
 *
 * @author AmrvEbada <amr.ebada@itv-me.com>
 */
public class airplane extends Transport {

    public airplane(String name) {
        super.setName(name);
        super.setEngineType("Jet");
        super.setNumberOfWheels(3);
    }

}

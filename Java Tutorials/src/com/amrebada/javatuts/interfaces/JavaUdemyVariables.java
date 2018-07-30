/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.interfaces;

/**
 *
 * @author AmrvEbada  
 */
public class JavaUdemyVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DesktopAlarmView dav = new DesktopAlarmView(new coreInterface());
        dav.start();
        WebAlarmView wav = new WebAlarmView(new coreInterface());
        wav.start();
        MobileAlarmView mav = new MobileAlarmView(new coreInterface());
        mav.start();
    }

}

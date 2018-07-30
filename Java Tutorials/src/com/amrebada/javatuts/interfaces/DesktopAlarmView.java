/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.interfaces;

import java.util.List;

/**
 *
 * @author AmrvEbada  
 */
public class DesktopAlarmView {

    private final IAlarmViewPlugin core;

    public DesktopAlarmView(IAlarmViewPlugin core) {
        this.core = core;
    }

    public void start() {
        System.out.println("Desktop Start getting Alarms....");
        List<String> alarms = core.getAlarms();
        for (String alarm : alarms) {
            System.out.println("Alarm : " + alarm);
        }
    }

}

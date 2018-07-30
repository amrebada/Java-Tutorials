/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AmrvEbada  
 */
public class coreInterface implements IAlarmViewPlugin {

    private IAlarmViewPlugin alarmViewPlugin;

    public void addAlarmViewPlugin(IAlarmViewPlugin alarmViewPlugin) {
        this.alarmViewPlugin = alarmViewPlugin;
    }

    @Override
    public List<String> getAlarms() {
        List<String> alarms = new ArrayList<>();
        alarms.add("Alarm 1");
        alarms.add("Alarm 2");
    
        alarms.add("Alarm 4");
        alarms.add("Alarm 5");
        return alarms;
    }

    @Override
    public boolean setAction(Type type, String value) {
        boolean actionSuccess = false;

        switch (type) {
            case reset:
                System.err.println("Reset Alarm to Value " + value);
                actionSuccess = true;
                break;
            case share:
                System.err.println("share Alarm with Value " + value);
                actionSuccess = true;
                break;
            case workflow:
                System.err.println("workflow add to Alarm with Value " + value);
                actionSuccess = true;
                break;
            default:
                System.err.println("couldn't recognize Type of Action ");
                break;

        }

        return actionSuccess;
    }

    @Override
    public List<List<String>> getHistoryOfAlarms() {
        List<String> alarm1 = new ArrayList<>();
        alarm1.add("name : Alarm 1");
        alarm1.add("Location : Alex");
        alarm1.add("Date : thu");
        List<String> alarm2 = new ArrayList<>();
        alarm2.add("name : Alarm 2");
        alarm2.add("Location : aswan");
        alarm2.add("Date : wed");
        List<String> alarm3 = new ArrayList<>();
        alarm3.add("name : Alarm 3");
        alarm3.add("Location : cairo");
        alarm3.add("Date : sat");
        List<List<String>> History = new ArrayList<>();
        History.add(alarm1);
        History.add(alarm2);
        History.add(alarm3);
        return History;
    }

    @Override
    public List<List<String>> getHistoryOfAlarmsByModuleID(int moduleId) {
        List<String> alarm1 = new ArrayList<>();
        alarm1.add("name : Alarm 1");
        alarm1.add("Location : Alex");
        alarm1.add("Date : thu");

        List<String> alarm3 = new ArrayList<>();
        alarm3.add("name : Alarm 3");
        alarm3.add("Location : cairo");
        alarm3.add("Date : sat");
        List<List<String>> History = new ArrayList<>();
        History.add(alarm1);
        History.add(alarm3);
        return History;
    }

    @Override
    public List<String> searchAlarmsByName(String name) {
        List<String> alarm1 = new ArrayList<>();
        alarm1.add("name : Alarm 1");
        alarm1.add("Location : Alex");
        alarm1.add("Date : thu");
        return alarm1;
    }

}

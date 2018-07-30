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
public interface IAlarmViewPlugin {
    
    public List<String> getAlarms();
    
    public boolean setAction(Type type,String value);
    
    public  List<List<String>> getHistoryOfAlarms();
    
    public  List<List<String>> getHistoryOfAlarmsByModuleID(int moduleId);
    
    public List<String> searchAlarmsByName(String name);
    
}

package com.project.java;

import java.util.ArrayList;

public class Vehicle_info {
    Vehicle_info(){}
    //function to display vehicles data
    public void display_vehicles(ArrayList<Vehicle> veh){
        for (int i=0;i<veh.size();i++){
            System.out.println("Car "+(i+1));
            displayvehicles(veh.get(i));
        }
    }
    public void displayvehicles(Vehicle ve){
        System.out.println("Model name: "+ve.getModel_name()+
                "\n model num : "+ve.getModel_num()+
                "\n Id: "+ve.getId()+
                "\n arrival time: "+ve.time.getArrival());
    }
}

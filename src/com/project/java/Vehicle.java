package com.project.java;
import java.util.ArrayList;

//class to store vehicles values
public class Vehicle {

    public String model_name;
    public int model_num;
    public int id;
    private int width;
    private int depth;
    Time time=new Time();

    public Vehicle() {
    }
    public Vehicle(String s,int a,int c,int d ){
        model_name=s;model_num=a;width=c;depth=d;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getModel_num() {
        return model_num;
    }

    public int getId() {
        return id;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel_name() {
        return model_name;
    }



}

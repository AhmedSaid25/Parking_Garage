package com.project.java;
import java.util.ArrayList;
import java.util.Scanner;
//class garage store all slots with all dimentions
public class Garage {
    private int slotsnum;
    public ArrayList<Slot> parkingSlots = new ArrayList<Slot>();
    public int[]arr;
    public  int ID=0;
    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();



    public int getSlotsnum() {
        return slotsnum;
    }

    public  int getID() {
        return ID;
    }
//constructor set all garage information
    public Garage(int slots){
        this.slotsnum = slots;

        arr=new int[slotsnum];
        for (int i=0;i<slotsnum;++i){
            arr[i]=0;
        }
        System.out.println("Enter the dimintions of slots num");
        for (int i=0;i<slotsnum;++i){
            Scanner myObj = new Scanner(System.in);
            int w = myObj.nextInt();
           // Scanner myObj1 = new Scanner(System.in);
            int d = myObj.nextInt();
            Slot n=new Slot(w,d);
            parkingSlots.add(n);

        }
    }



}

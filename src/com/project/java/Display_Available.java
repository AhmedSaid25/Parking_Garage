package com.project.java;
//class display empty slots in the garage
public class Display_Available {
    public void display_available(Garage g){
        for(int i=0;i<g.getSlotsnum();++i){
            if(g.arr[i]==0){
                System.out.print(i);System.out.print(" ");
            }
        }
    }
}

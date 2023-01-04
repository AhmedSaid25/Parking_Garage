package com.project.java;

// checkout class to store the total income in one object
// as design patterns (sigleton)
public class Checkout {
    public int total_income=0;
    private Checkout(){}
    private static Checkout instance=new Checkout();

    public static Checkout getinstance(){
        return instance;
    }
    public void income(int fee){
        total_income+=(fee*5);
    }

}

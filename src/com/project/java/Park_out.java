package com.project.java;
// park out find the slot of the driver that he will leave
//print the total fees of this driver
//departure time
//add it to the total income
public class Park_out {
    Park_out(int x, Garage n, Vehicle v){
        Checkout total= Checkout.getinstance();
        if(n.arr[x]==1){
            n.arr[x]=0;
            for (int i=0;i<n.vehicles.size();i++){
                if(n.vehicles.get(i).getId()==x){
                    v.time.setleave();
                    int fees=v.time.calculate(n.vehicles.get(i).time.getArrival(),v.time.leave_time );
                    System.out.println(fees);
                   // v.setFees(fees);
                    System.out.println("YOU Should pay: "+fees*5);
                    total.income(fees);
                    n.vehicles.remove(i);
                    System.out.println("THANK YOU");
                    System.out.println("slot is empty now !!");
                }
            }

           // c.time.setarrival();

        }
        else{
            System.out.println("slot is already empty");
        }


    }
}

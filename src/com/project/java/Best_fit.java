package com.project.java;
//park in function with best fit
// find the slot with the minimum dimension to hold the vehicle
public class Best_fit implements Park_in {
    @Override
    public void park(Vehicle obj, Garage n) {
        //LocalTime myObj = LocalTime.now();

        obj.setId(n.getID());
        //variables to help to store minimum dimentions fit this car
        int mn_width=100000,mn_legnth=100000;
        boolean f=true;
        int x = 0;
        // loop to find best fit slot to set the car in it
        for(int i=0;i<n.getSlotsnum();++i){
            if(obj.getWidth()<=n.parkingSlots.get(i).getWidth()&&obj.getDepth()<=n.parkingSlots.get(i).getDepth()
                    &&n.arr[i]==0&&n.parkingSlots.get(i).getWidth()<=mn_width&&n.parkingSlots.get(i).getDepth()<=mn_legnth){
                mn_width=n.parkingSlots.get(i).getWidth();
                mn_legnth=n.parkingSlots.get(i).getDepth();
                obj.time.setarrival();
                x=i+1;
                n.ID++;
                f=false;

            }
        }
        //condition to check if there is no slot suitable or garage is full
        if(f==true){
            System.out.println("sorry , there is no slot fits your car");
        }
        else{
            if(x>0){
                // put this slot as full
                n.arr[x-1]=1;
                obj.id=x-1;
                //add vehicle information
                n.vehicles.add(obj);
                System.out.print("Here is Your Slot: ");
                System.out.println(x-1);
            }


        }

    }
}

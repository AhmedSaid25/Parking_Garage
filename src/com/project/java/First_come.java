package com.project.java;
//park in function with first come first served slots i.e., the park-in
//function will use the first free slot available from the parking garage slots
public class First_come implements Park_in {
    @Override
    public void park(Vehicle obj2, Garage n) {

        boolean f=true;
        obj2.setId(n.getID());
        for(int i=0;i<n.getSlotsnum();++i){
            if(obj2.getWidth()<=n.parkingSlots.get(i).getWidth()&&obj2.getDepth()<=n.parkingSlots.get(i).getDepth()&&n.arr[i]==0){
                //when you find available slot put car in it
                n.arr[i]=1;n.ID++;
                obj2.time.setarrival();
                obj2.id=i;
                f=false;
                n.vehicles.add(obj2) ;

                System.out.print("Here is Your Slot: ");
                System.out.println(i);
                break;
            }}
        //condition if the garage is full or no available slots
        if(f==true){
            System.out.println("sorry , there is no slot fits your car");
        }
    }
}

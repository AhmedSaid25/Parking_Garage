package com.project.java;

import java.util.Scanner;
// Display class act as screen to the user
public class Display {
    Scanner myObj = new Scanner(System.in);
    public Display(){
    System.out.println("Owner should set system information");
    Login owner=new Login();
    System.out.println("enter your mail");
    String mail=myObj.next();
    owner.setEmail(mail);
        System.out.println("enter your password");
    int pass=myObj.nextInt();
    owner.setPassword(pass);
    System.out.println("Enter slots num");
    int slots = myObj.nextInt();
    Garage obj=new Garage(slots);
    System.out.println("choose one of the two configurations");
    int con= myObj.nextInt();
    while (true){
        System.out.println("if you are owner choose 1 or choose 2 if you are driver:");
        int type=myObj.nextInt();
        if(type==1){
            System.out.println("Enter the password :");
            int eemail=myObj.nextInt();

            if(eemail==owner.getPassword()){
                while (true){
                    System.out.println("choose 1 for Display available slots");
                    System.out.println("choose 2 to display total income");
                    System.out.println("choose any other number to exit");
                    int n= myObj.nextInt();
                    if(n==1){
                        System.out.print("Available Slots :");
                        Display_Available view=new Display_Available();
                        view.display_available(obj);
                        System.out.println("\n");
                        System.out.print("here's the parked car's data: \n");
                        Vehicle_info print=new Vehicle_info();
                        print.display_vehicles(obj.vehicles);
                    }
                    else if(n==2){
                        Checkout tot= Checkout.getinstance();
                        System.out.println(tot.total_income);
                    }
                    else {
                        break;
                    }
                }

            }
            else {
                System.out.println("The Password is wrong !!");
            }

        }
        else if (type==2){
            if(con==1){
                while (true){
                    System.out.println("choose 1 for park in");
                    System.out.println("choose 2 for park out");
                    System.out.println("choose any other number to exit");

                    int n= myObj.nextInt();
                    if(n==1){
                        System.out.println("Enter Vehicle model name");
                        String m=myObj.next();
                        System.out.println("Enter Vehicle model number");
                        int m_num= myObj.nextInt();
                        System.out.println("Enter Vehicle width");
                        int w= myObj.nextInt();
                        System.out.println("Enter Vehicle Depth");
                        int d= myObj.nextInt();
                        Vehicle v=new Vehicle(m,m_num,w,d);
                        ///obj.parkin1(v);
                        Park_in obb=new First_come();
                        obb.park(v,obj);




                    }

                    else if(n==2){
                        System.out.println("Enter You Slot to leave the garage");
                        int num= myObj.nextInt();
                        for (int i=0;i<obj.vehicles.size();i++){
                            if(obj.vehicles.get(i).getId()==num){
                                Park_out ok=new Park_out(num,obj,obj.vehicles.get(i));
                            }
                        }

                    }

                    else {
                        break;
                    }
                }
            }
            else if(con==2){
                while (true){
                    System.out.println("choose 1 for park in");
                    System.out.println("choose 2 for park out");
                    System.out.println("choose any other number for end");
                    int n= myObj.nextInt();
                    if(n==1){
                        System.out.println("Enter Vehicle model name");
                        String m=myObj.next();
                        System.out.println("Enter Vehicle model number");
                        int m_num= myObj.nextInt();
                        System.out.println("Enter Vehicle width");
                        int w= myObj.nextInt();
                        System.out.println("Enter Vehicle Debth");
                        int d= myObj.nextInt();
                        Vehicle v=new Vehicle(m,m_num,w,d);

                        Park_in obb=new Best_fit();
                        obb.park(v,obj);
//                        vehicle_data print=new vehicle_data();
//                        print.display_vehicles(obj.vehicles);
                    }

                    else if(n==2){
                        System.out.println("Enter You Slot to leave the garage");
                        int num= myObj.nextInt();
                        for (int i=0;i<obj.vehicles.size();i++){
                            if(obj.vehicles.get(i).getId()==num){
                                Park_out ok=new Park_out(num,obj,obj.vehicles.get(i));
                            }
                        }
                    }
                    else{
                        break;
                    }


                }


            }
        }
        else {
            break;
        }

    }






    }



}

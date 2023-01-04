package com.project.java;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
//class time used for capture time
public class Time {
    public Date arrival;
    public Date leave_time;

    public void setarrival(){
        arrival= getTimeNow() ;
    }
    public void setleave(){

        leave_time= getTimeNow() ;
    }
    //function to store time automatically and form it
    public static Date getTimeNow() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String date = time.format(formatter);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date arrival = null;
        try {
            arrival = format.parse(date);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return arrival;
    }

    //function calculate difference between to dates and make time with minutes to see the value faster
    public  int calculate(Date arrival, Date leave_time) {
        long result = 0;
        result = (leave_time.getTime() - arrival.getTime());
        result = result / (1000 * 60); // Time with minutes
        return (int) result;
    }

    public Date getArrival() {
        return arrival;
    }



}

package com.irctc.booking;

import com.irctc.fare.TrainType;

public class MainApp {

    public static void main(String[] args) {

        try {

            String train =
                    args[0];

            int age =
                    Integer.parseInt(args[1]);

            int passengerCount =
                    Integer.parseInt(args[2]);

            TrainType trainType =
                    TrainType.valueOf(
                            train.toUpperCase());

            Booking.processBooking(
                    trainType,
                    age,
                    passengerCount);

        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Usage : "
                    + "java MainApp "
                    + "RAJDHANI 65 4");
        }
        catch(Exception e) {

            System.out.println(
                    "Error : "
                    + e.getMessage());
        }
    }
}

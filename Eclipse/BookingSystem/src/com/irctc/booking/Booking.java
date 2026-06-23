package com.irctc.booking;

import com.irctc.fare.DiscountEngine;
import com.irctc.fare.FareCalculator;
import com.irctc.fare.TrainType;

public class Booking {

    public static void processBooking(
            TrainType trainType,
            int age,
            int passengerCount) {

        if(passengerCount > 6) {

            throw new IllegalArgumentException(
                    "Maximum 6 passengers allowed");
        }

        double baseFare =
                FareCalculator.calculateFare(trainType);

        double totalFare =
                baseFare * passengerCount;

        double discount =
                DiscountEngine.calculateDiscount(age);

        double finalFare =
                totalFare -
                ((totalFare * discount) / 100);

        System.out.println("Train Type :: "
                + trainType);

        System.out.println("Base Fare :: "
                + baseFare);

        System.out.println();

        for(int i = 1; i <= passengerCount; i++) {

            if(i <= 2) {

                System.out.println(
                        "Passenger-" + i +
                        " : Confirmed");
            }
            else if(i == 3) {

                System.out.println(
                        "Passenger-" + i +
                        " : RAC");
            }
            else {

                System.out.println(
                        "Passenger-" + i +
                        " : Waiting");
            }
        }

        System.out.println();

        System.out.println(
                "Discount :: "
                + discount + "%");

        System.out.println(
                "Final Fare :: "
                + finalFare);
    }
}
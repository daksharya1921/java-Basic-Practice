package com.irctc.fare;

public class FareCalculator {

    public static double calculateFare(TrainType trainType) {

        switch(trainType) {

            case EXPRESS:
                return 500;

            case SUPERFAST:
                return 1000;

            case RAJDHANI:
                return 2000;

            default:
                return 0;
        }
    }
}

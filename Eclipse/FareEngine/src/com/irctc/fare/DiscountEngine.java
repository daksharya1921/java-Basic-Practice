/* . Use If-Else for Age Discount.
Age < 5 => 100%
Age 5-18 => 50%
Age 19-59 => 0%
Age >= 60 => 30% */


package com.irctc.fare;

//

public class DiscountEngine {

    public static double calculateDiscount(int age) {

        if(age < 5) {
            return 100;
        }
        else if(age <= 18) {
            return 50;
        }
        else if(age >= 60) {
            return 30;
        }
        else {
            return 0;
        }
    }
}
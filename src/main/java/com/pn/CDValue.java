package com.pn;
///////A calculator that determines the future value of a one-time
// deposit assuming compound interest  ///
/// will display future value as well as total interest///

import java.util.*;

public class CDValue {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        /// ask for deposit amount, interest rate, and number of years for investment///
        System.out.println("Howdy. I am here to help calculate the future value of your CD investment.");

        System.out.println("How much will your deposit be: ");
        double deposit = myScanner.nextDouble();

        System.out.println( "What will be the annual interest rate: ");
        float annualInterestRate = myScanner.nextFloat()/100;

        System.out.println("What will the term length be in years: ");
        int termInYears = myScanner.nextInt();

        /// future value formula : FV= PV*(1+i)^n   ////
        // pv == deposit
        // i == interest
        // n == term in years

        double futureValue = deposit* (Math.pow  ( annualInterestRate + 1 ,termInYears));

        double totalInterest = futureValue - deposit;

        //// show total future value as well as total interest earned//
//        System.out.printf( "In total with an investment of  " + deposit + " and an annual interest rate of " + annualInterestRate * 100 +
//                " you will have a total of" + "'$.2f%'", futureValue );
//        System.out.println( " The total interest amount would be " + totalInterest + ".");

        System.out.printf("%.2f",futureValue) ;









    }






}

package com.pn;

import java.util.Scanner;


public class MortgageCalculator {
        private static final int months = 12;
        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);

        /// ask for principal, interest, and term ///
            System.out.println( "Hello there. I am here to help with your mortgage calculations.");

            System.out.println(" What is your principal amount: ");
            double principle = myScanner.nextDouble();

            System.out.println( "What is the annual interest rate: ");
            float annualInterestRate = myScanner.nextFloat() / 100;

            System.out.println( "How many years is your term: ");
            int  termInYears = myScanner.nextInt();
            /// formula to follow M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]///
            float monthlyInterestRate = annualInterestRate / months;
            int numOfPayments = termInYears * months;
            double monthlyPayment =  principle * (
                    (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numOfPayments)))/ ((Math.pow(1 + monthlyInterestRate, numOfPayments))- 1)
            );
            /// show the monthly payment
            double  totalInterest = (monthlyPayment *numOfPayments) - principle;
            System.out.println("The monthly payment would be  " + monthlyPayment + " with a lifetime interest of  " + totalInterest + ".");


//            System.out.println(" What is the monthly principle:");
//            float principleNum = myScanner.nextFloat();

//            System.out.println(" What is the monthly interest rate:");
//            float interestNum = myScanner.nextFloat();
//
//            System.out.println( "How long is the Loan for in months");
//            float lengthNum = myScanner.nextFloat();





        }



}

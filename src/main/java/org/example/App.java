package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: " );
        double prin = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = sc.nextDouble();
        double investment = (prin * (1+rate * 0.01 * years));
        System.out.println("After " +years+ " years at " + rate +"%, the investment will be worth $"+Math.round(investment*100)/100.0 +".");
    }
}

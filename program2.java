/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *2. Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
The marks are entered by the user and the roll numbers are automatically assigned.
 * 
 */

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        String roll;
        float s1,s2,s3;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=8; i++){
                System.out.print("\nEnter Your Roll Number: ");
                roll = sc.next();

                System.out.print("Enter Your First Subject Mark: ");
                s1 = sc.nextFloat();
                System.out.print("Enter Your Second Subject Mark: ");
                s2 = sc.nextFloat();
                System.out.print("Enter Your Third Subject Mark: ");
                s3 = sc.nextFloat();

                float avg = (s1 + s2 + s3) / 3;

                if(s1<=100 && s2<=100 && s3<=100){
                    System.out.printf("\nAverage Mark of Roll Number %s is %.1f\n", roll, avg);
                }
                else{
                    System.out.println("\nPlease Enter Your Marks Between 0 to 100");
                }
            }
    }
}

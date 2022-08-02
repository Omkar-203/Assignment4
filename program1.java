/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *
 * 1. Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.
 */
import java.util.Scanner;
 class employee {
    String name;
    int salary;
    String date;
    
 public void getdata()
    {
            Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter your employee name:");
        String e = sc.next();
        System.out.printf("Please enter your salary:");
        double s= sc.nextInt();
         System.out.printf("Please enter your date:");
        String p= sc.next();
    } 
 public void display()
 {
     System.out.printf("employee Name:" +name);
      System.out.printf("employee salary:" +salary);
       System.out.printf("employee date:" +date);
 }
}
public class program1{
public static void main(String[] args){
    employee s1[]= new employee[10];
    int i,j;
     for(i=0;i<10;i++)
     {
         s1[i]=new employee(); 
         s1[i].getdata();
     }
     for(i=0;i<10;i++)
     {
         // s1[i]=new employee(); 
       s1[i].display();
     }
}
}
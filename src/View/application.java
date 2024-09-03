/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.ArrayBee;
import Controller.BeeController;
import java.util.Random;
import java.util.Scanner;

public class application {
    Scanner sc=new Scanner(System.in);
    public int getChocie()
    {
        int choice;
        do
        {
            try{
            do
            {
                System.out.println("---------------------^---------------------");
                System.out.println("1. Create bee list");
                System.out.println("2. Attack bees");
                System.out.println("3. Exit");
                System.out.println("---------------------v---------------------");
                System.out.print("enter your choice:");
                choice=sc.nextInt();   
            }
            while(choice<1 || choice >3);
            break;
            }
            catch(Exception e)
            {
                sc.nextLine();
                System.out.println("Enter integer please !!!!");
            }
        }
        while(true);
        return choice;
    }
    
    
    public static void main(String[] args) {
        BeeController a=new BeeController();
        application ap=new application();
        a.Display();
        int choice;
        do
        {
            choice=ap.getChocie();
            switch(choice)
            {
                case 1:
                {
                    a.createList();
                    break;
                }
                case 2:
                {
                    a.Attack();
                    break;
                }
                default:System.out.println("\nBye!!!!!!!!!!!!!!!");
            }
        }
        while(choice!=3);
    }
    
}

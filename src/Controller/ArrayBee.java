/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayBee {
    private ArrayList<Bee> ar=new ArrayList();
    Scanner sc=new Scanner(System.in);
    
    long seed=System.currentTimeMillis();
    Random rd=new Random(seed);
    
    static String inputData="inputData.txt";
    
   public void ArrayBee()
    {
        try {
            BufferedReader rf=new BufferedReader(new FileReader(inputData));
            int temp;
            while((temp=rf.read())!=-1)
            { 
                temp-=48;
                if(temp==1)
                    {
                        ar.add(new Worker());
                    }
                    else if(temp==2)
                    {
                        ar.add(new Qeen());
                    }
                    else
                    {
                        ar.add(new Drone());
                    }
            }    
            rf.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    
    public ArrayList<Bee> display()
    {
        return ar;
    }
    
    public void CreateList(int nums)
    {
        ar.clear();
        for(int i=0;i<nums;i++)
        {
            int temp=1+Math.abs(rd.nextInt())%3;
            if(temp==1)
            {
                ar.add(new Worker());
            }
            else if(temp==2)
            {
                ar.add(new Qeen());
            }
            else
            {
                ar.add(new Drone());
            }
        }
    }
    
    public void Attack()
    {
        for(Bee a:ar)
        {
            if(!a.isDead())
            {
                int damage=Math.abs(rd.nextInt())%80;    
                a.Damage(damage);
            }
            if(a.getHelth()<0)
                a.setHelth(0);
        }
    }
    public static void main(String[] args) {
        ArrayBee a=new ArrayBee();
        System.out.println(a.ar.size());
    }
}

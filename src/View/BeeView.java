/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Bee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuc2
 */
public class BeeView {
    private Scanner sc=new Scanner(System.in);

    public Scanner getSc() {
        return sc;
    }
    
    public int numsBee() throws Exception
    {
        while(true)
        {
            mess("Enter number: ");
            int result=sc.nextInt();sc.nextLine();
            return result;
        }
    }
    
    public void Display(ArrayList<Bee> ar)
    {
        for(Bee b:ar)
        {
            System.out.println(b.toString());
        }
    }
    
    public void mess(String a)
    {
        System.out.println(a);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.BeeView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuc2
 */
public class BeeController {
    private ArrayBee arb=new ArrayBee();
    private BeeView view=new BeeView();
    
    public void createList()
    {
        int num=0;
        while(true)
        {
            try 
            {
                num = view.numsBee();
                break;
            } 
            catch (Exception ex) 
            {
                view.getSc().nextLine();
                view.mess("Invalid numbers");
            }
        }
        arb.CreateList(num);
        Display();
    }
    
    public void Attack()
    {
        arb.Attack();
        Display();
    }
    
    public void Display()
    {
        view.Display(arb.display());
    }
}

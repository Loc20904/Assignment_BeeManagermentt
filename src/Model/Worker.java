/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phuc2
 */
public class Worker extends Bee {
    public Worker(){}
    
    @Override
    public void Damage(int x)
    {
        super.Damage(x);
        if(getHelth()<70)
            setDead(true);
    }
    
    @Override
    public String toString()
    {
        return "\n>>Worker"+super.toString();
    }
}

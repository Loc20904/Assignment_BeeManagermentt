/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phuc2
 */
public class Drone extends Bee {
    public Drone(){}
    
    @Override
    public void Damage(int x)
    {
        super.Damage(x);
        if(getHelth()<50)
            setDead(true);
    }
    @Override
    public String toString()
    {
        return "\n>>Drone"+super.toString();
    }
}

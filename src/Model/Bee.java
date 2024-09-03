/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phuc2
 */
public class Bee {
    private double helth=100;
    private boolean Dead=false;
    
    public Bee(){}
    
    public double getHelth() {
        return helth;
    }

    public void setHelth(double helth) {
        this.helth = helth;
    }

    public boolean isDead() {
        return Dead;
    }

    public void setDead(boolean Dead) {
        this.Dead = Dead;
    }
    
    public void Damage(int x)
    {    
        helth -= x;
    }
    
    @Override
    public String toString()
    {
        String temp;
        if(Dead)
        {
            temp="Had dead";
        }
        else
        {
            temp="Alive";
        }
        return helth+temp;
    }
    
}

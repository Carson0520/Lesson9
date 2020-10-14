/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceEx1;

/**
 *
 * @author cars0520
 */
public class Zombie implements Monster{

    
    private String name;
    
    public Zombie (String n){
        name = n;
    }
    @Override
    public void attack() {
        System.out.println("Zombie is eating your brains!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the Zombie.");
    }
    
}

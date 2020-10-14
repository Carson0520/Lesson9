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
public class Werewolf implements Monster {
    
    private String name;
    
    public Werewolf(String n){
        name = n;
    }

    @Override
    public void attack() {
        System.out.println("Werewold is clawing at you!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the Werewolf.");
    }
    
}

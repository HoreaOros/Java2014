/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp;

/**
 *
 * @author Horea
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        
        ContBancar cb1 = new ContBancar("BTRL012RO5487512", 100);
        cb1.afisareSold();
        
        ContBancar cb2 = new ContBancar("BCR13454RO0987");
        cb2.afisareSold();
        
        try{
            cb1.depune(200);
            cb1.retrage(150);
            cb1.afisareSold();
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("A aparut o situatia exceptionala");
        }
        
        cb2.retrage(100);
        
        cb2.depune(100);
        cb2.afisareSold();
        
        cb2.retrage(50);
        cb2.afisareSold();
        
    }
    
}

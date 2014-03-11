/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Horea
 */
public class ContBancar {
    private int sold;
    private String id;
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    public ContBancar(String id, int sold)
    {
        this.id = id;
        this.sold = sold;
    }

    public ContBancar(String id) {
        this.id = id;
        this.sold = 0;
    }
    public void afisareSold()
    {
        System.out.println("Soldul contului " + id + " este " + sold);
        //LOGGER.log(Level.OFF, "S-a apelat afisareSold()");
    }

    public void depune(int suma) {
        if(suma > 0)
        {
            sold += suma;
            System.out.println("Operatie de depunere reusita (" + suma + ")");
        }
        else
            System.out.println("Nu se poate depune o suma negativa!");
    }

    public void retrage(int suma) {
        if(suma > 0)
            if(suma <= sold)
            {
                sold -= suma;
                System.out.println("Operatie de retragere reusita (" + suma + ")");
            }
            else
                System.out.println("Fonduri insuficiente");
        else
            System.out.println("Suma ce se retrage nu poate fi negativa");
    }
}

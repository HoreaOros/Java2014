/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datacalendaristica;

/**
 *
 * @author Horea
 */
public class DataCalendaristica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DC d1 = new DC(25, 3, 2014);
        DC d2 = new DC(1, 1, 1970);
        
        
        
        d1.Afisare();
        d2.Afisare();
        
        System.out.println(d1);
        System.out.println(d2);
        
        
        System.out.println("Diferenta de zile este: " + d2.DiffDays(d1));
        
        System.out.println(d1);
        System.out.println(d2);
    }
    
}

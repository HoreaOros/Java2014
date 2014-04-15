/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time;

/**
 *
 * @author Horea
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyTime t1 = new MyTime(14, 53, 22);
        MyTime t2 = new MyTime(14, 53);
        MyTime t3 = new MyTime(14);
        MyTime t4 = new MyTime();
        MyTime t5 = new MyTime("14:53:22");
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        
        MyTime t6 = t1.AddHours(2);
        System.out.println(t6);
        
        MyTime t7 = t6.AddMinutes(70);
        System.out.println(t7);
        
        // TODO
        boolean b1 = t1.isLessThan(t2);
        boolean b2 = t1.isGreaterThan(t2);
        boolean b3 = t1.isEqual(t2);
    }
}

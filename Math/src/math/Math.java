/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math;

/**
 *
 * @author Horea
 */
public class Math {
    // functie cu numar variabil de parametri
    // nums este tratat ca un vector
    public static int suma(int... nums){
        int s = 0;
        int i;
        for(i = 0; i < nums.length; i++){
            s = s + nums[i];
        }
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        // testarea functiei cu numar variabil de parametri
        a = suma(1, 2, 3);
        System.out.println(a);
        
        a = suma(1, 2, 3, 4);
        System.out.println(a);
        
        
        int[] t = new int[]{1, 2, 3, 4, 5};
        a = suma(t);
        System.out.println(a);
        
        // testarea clasei Cerc
        Cerc c1 = new Cerc(2, 3, 4);
        System.out.println("Aria cercului este: " + c1.Aria());
        
        System.out.println(c1);
    }
    
}

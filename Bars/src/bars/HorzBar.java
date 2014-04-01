/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bars;

/**
 *
 * @author Horea
 */
public class HorzBar {
    int lungime;
    public HorzBar(int x) {
        lungime = x;
        System.out.print("+");
        for(int i = 0; i < lungime; i++)
            System.out.print("-");
        System.out.println("+");
    }      
}

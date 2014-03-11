/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formegeometrice;

/**
 *
 * @author Horea
 */
public class FormeGeometrice {

    /**
     * @param args the command line arguments
     */
    
    static void Transform(Scalable s)
    {
        //....
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        FormaGeometrica[] fg = new FormaGeometrica[10];
        for(int i = 0; i < fg.length; i++)
            if(i % 2 == 0)
                fg[i] = new Dreptunghi("id" + i);
            else
                fg[i] = new Elipsa("id" + i);
        
        //for (FormaGeometrica fg1 : fg) {
        //    fg1.Desenare();
        //}
        
         //sau mai clasic:
        for(int i = 0; i < fg.length; i++)
            fg[i].Desenare();
    }
    
}

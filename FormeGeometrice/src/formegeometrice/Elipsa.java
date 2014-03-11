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
public class Elipsa extends FormaGeometrica{
    public Elipsa(String id)
    {
        super(id);
        System.out.println("Am creat o elipsa");
    }
    /**
     * Functia polimorfica
     */
    @Override
    public void Desenare() {
        System.out.println("Am desenat o elipsa - " + id);
    }
}

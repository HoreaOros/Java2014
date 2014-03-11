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
public class Dreptunghi extends FormaGeometrica{
    public Dreptunghi(String id)
    {
        super(id);
        System.out.println("Am creat un dreptunghi");
    }

    @Override
    public void Desenare() {
        System.out.println("Am desenat un dreptunghi - " + id);
    }
}

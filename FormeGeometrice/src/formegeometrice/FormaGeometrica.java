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
public class FormaGeometrica implements Scalable{
    String id;
    float dimensiune;
    public FormaGeometrica(String id)
    {
        this.id = id;
        this.dimensiune = 1;
        System.out.println("Am creat o forma geometrica - " + id);
    }
    public void Desenare()
    {
        //
    }

    @Override
    public void Grow(int s) {
        dimensiune *= s;
    }

    @Override
    public void Shrink(int s) {
        dimensiune /= s;
    }
}

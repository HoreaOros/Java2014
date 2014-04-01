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
class Ladder {
    Frame f1, f2;
    VertBar v;
    public Ladder(int lungime, int inaltime, int h){
        f1 = new Frame(lungime, inaltime);
        v = new VertBar(h);
        f2 = new Frame(lungime, inaltime);
    }
}

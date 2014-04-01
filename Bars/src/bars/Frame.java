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
public class Frame {
    HorzBar h1, h2;
    VertBar v;
    public Frame(int lungime, int inaltime) {
        h1 = new HorzBar(lungime);
        v = new VertBar(inaltime);
        h2 = new HorzBar(lungime);
    }
}

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
class VertBar {
    int inaltime;
    public VertBar(int x) {
        inaltime = x;
        for(int i = 0; i < inaltime; i++)
            System.out.println("|");
    }
}

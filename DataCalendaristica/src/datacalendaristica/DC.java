/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datacalendaristica;

/**
 *
 * @author Horea
 */
public class DC implements Comparable<DC> {
    private final static String[] lunile = {"Ianuarie",
    "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie",
    "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
    private int zi, luna, an;
    public DC(int zi, int luna, int an)
    {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }
    public DC(DC c)
    {
        zi = c.zi;
        luna = c.luna;
        an = c.an;
    }
    public void Afisare() {
        System.out.print(zi);
        System.out.print(" ");
        if(luna >= 1 && luna <= 12)
            System.out.print(lunile[luna - 1]);
        System.out.print(" ");
        System.out.println(an);
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%d", zi, luna, an);
    }

    public int DiffDays(DC d) {
        int contor = 0;
        DC d1, d2;
        if(compareTo(d) < 0)
        {
            d1 = new DC(this);
            d2 = new DC(d);
        }
        else
        {
            d1 = new DC(d);
            d2 = new DC(this);
        }
        
        while(!d1.equals(d2))
        {
            d2.ScadeOZi();
            contor++;
        }
        return contor;
    }

    @Override
    public boolean equals(Object o) {
        DC d = (DC)o;
        return d.zi == zi && d.luna == luna && d.an == an;
    }
    public void ScadeOZi()
    {
        if(zi > 1)
            zi--;
        else
            switch(luna)
            {
                case 1:
                    zi = 31;
                    luna = 12;
                    an--;
                    break;
                case 2: case 4: case 6: case 8: case 9: case 11:
                    zi = 31;
                    luna--;
                    break;
                case 3:
                    zi = ((an % 4 == 0 && an % 100 != 0) || 
                            (an % 400 == 0))? 29: 28;
                    luna--;
                    break;
                case 5: case 7: case 10: case 12:
                    zi = 30;
                    luna--;
                    break;
            }
    }

    @Override
    public int compareTo(DC t) {
        if(an < t.an)
            return -1;
        else if(an > t.an)
            return 1;
        else if(luna < t.luna)
            return -1;
        else if(luna > t.luna)
            return 1;
        else if(zi < t.zi)
            return -1;
        else if(zi > t.zi)
            return 1;
        else
            return 0;
            
    }
}

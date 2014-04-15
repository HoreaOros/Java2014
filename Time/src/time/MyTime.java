/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates;
 * and open the template in the editor.
 */

package time;

/**
 *
 * @author Horea
 */
class MyTime {
    private int ora, minut, secunda;
    public MyTime(int ora, int minut, int secunda) {
        this.ora = ora;
        this.minut = minut;
        this.secunda = secunda;
    }

    public MyTime(int ora, int minut) {
        this(ora, minut, 0);
        //Aici se pot pune alte instructiuni pentru initializare
    }
    
    public MyTime(int ora) {
        this(ora, 0);
    }
    
    public MyTime() {
        this(0);
    }
    public MyTime(String s) {
        String[] t = s.split(":");
        ora = Integer.valueOf(t[0]);
        minut = Integer.valueOf(t[1]);
        secunda  = Integer.valueOf(t[2]);
    }
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", ora, minut, secunda);
    }

    public MyTime AddHours(int h) {
        MyTime t = new MyTime(ora + h, minut, secunda);

        return t;
    }

    public MyTime AddMinutes(int m) {
        MyTime t = new MyTime(ora, minut, secunda);
        int r = 0;
        
        r = (t.minut + m) / 60;
        t.minut = (t.minut + m) % 60;
        
        
        if(r == 0)
            return t;
        else 
            return t.AddHours(r);
    }

    public boolean isEqual(MyTime t2) {
        return ora == t2.ora && minut == t2.minut && 
                secunda == t2.secunda;
    }

    public boolean isLessThan(MyTime t2) {
        if(ora < t2.ora)
            return true;
        else if(ora > t2.ora)
            return false;
        else if(minut < t2.minut)
            return true;
        else if(minut > t2.minut)
            return false;
        else if(secunda < t2.secunda)
            return true;
        else
            return false;
    }

    public boolean isGreaterThan(MyTime t2) {
        return !isLessThan(t2) && !isEqual(t2);
    }
}

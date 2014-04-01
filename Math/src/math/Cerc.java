/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math;

/**
 *
 * @author Horea
 */
public class Cerc {
    private int x, y;
    private int raza;
    public Cerc() {
        x = y = 0;
        raza = 0;
    }
    public Cerc(int x, int y, int raza) {
        this.x = x;
        this.y = y;
        this.raza = raza;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }
    public double Aria() {
        return java.lang.Math.PI * raza * raza;
    }
    public double Permiterul() {
        return 2 * java.lang.Math.PI * raza;
    }
    @Override 
    public String toString() {
        return "[(" + x + ", " + y + ") - " + raza + "]";
    }
}

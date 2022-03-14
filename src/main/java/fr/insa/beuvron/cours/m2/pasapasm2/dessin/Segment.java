/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import java.awt.Color;

/**
 *
 * @author francois
 */
public class Segment extends FigureSimple {

    private Point debut;
    private Point fin;

    public Segment(Point debut, Point fin, Color c) {
        super(c);
        this.debut = debut;
        this.fin = fin;
    }
    
    @Override
    public double maxX() {
        return Math.max(this.debut.maxX(), this.fin.maxX());
    }
    public String toString() {
        return "[" + this.debut.toString() + " ; " + this.fin + "]";
    }

    public Segment(Point debut, Point fin) {
        this(debut, fin, new Color(0, 0, 255));
    }

    public static void main(String[] args) {
        Segment s = new Segment(new Point(1, 2), new Point(3,4),
                new Color(200, 100, 30));
        System.out.println("s = " + s);

    }

    /**
     * @return the debut
     */
    public Point getDebut() {
        return debut;
    }

    /**
     * @return the fin
     */
    public Point getFin() {
        return fin;
    }

}

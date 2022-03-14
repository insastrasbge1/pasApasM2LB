/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

/**
 *
 * @author francois
 */
public abstract class Figure {
    
    /**
     * groupe dans lequel est inclue la figure.
     * null si aucun contenant
     */
    private Groupe contenuDans;
    
    public Figure() {
        this.contenuDans = null;
    }
    
    public abstract double maxX() ;
   public  double minX() {
       // TODO
       return 0;
   }
   
   public double largeur() {
       return this.maxX() - this.minX();
   }
    
}

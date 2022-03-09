/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francois
 */
public class Groupe {
    
    private List<Figure> contient;
    
    public Groupe(List<Figure> contient) {
        this.contient = contient;
    }
    
    public Groupe() {
        this.contient = new ArrayList<Figure>();
    }
    
    
    
}

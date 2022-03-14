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
public class Groupe extends Figure{
    
    private List<Figure> contient;
    
    public Groupe(List<Figure> contient) {
        this.contient = contient;
    }
    
    public Groupe() {
        this.contient = new ArrayList<Figure>();
    }
    
    @Override
    public double maxX() {
        if (this.contient.size() == 0) {
            return 0;
        } else {
            double max = this.contient.get(0).maxX();
            for(int i = 1 ; i < this.contient.size() ; i ++) {
                double cur = this.contient.get(i).maxX();
                if (cur > max ) {
                    max = cur;
                }
            }
            return max;
        }
    }
    
    
    
}

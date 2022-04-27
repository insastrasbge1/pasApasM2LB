/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public abstract class FigureSimple extends Figure {

    private Color couleur;

    public Color getCouleur() {
        return this.couleur;
    }

    public void setCouleur(Color c) {
        this.couleur = c;
    }

    public FigureSimple(Color c) {
        this.couleur = c;
    }

}

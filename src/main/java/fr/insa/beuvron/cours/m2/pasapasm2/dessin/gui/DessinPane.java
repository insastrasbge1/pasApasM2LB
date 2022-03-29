/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import javafx.scene.layout.Pane;

/**
 *
 * @author francois
 */
public class DessinPane extends Pane{
    
    private MainPanel main;
    
    public DessinPane(MainPanel main) {
        super();
        this.main = main;
        this.redrawAll();
    }
    
    public  void redrawAll() {
        this.getChildren().add(this.main.getModel().dessine());
    }
    
}

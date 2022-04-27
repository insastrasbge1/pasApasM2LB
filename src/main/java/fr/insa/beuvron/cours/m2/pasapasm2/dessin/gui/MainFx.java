/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import fr.insa.beuvron.cours.m2.pasapasm2.dessin.Groupe;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author francois
 */
public class MainFx extends Application {

    @Override  
    public void start(Stage primaryStage) throws Exception {
        Groupe test = Groupe.groupeAlea(10, 5);
//        Groupe test = new Groupe();
        System.out.println("taille " + test.getContient().size());
        MainPanel main = new MainPanel(test);
        Scene s = new Scene(main);
        primaryStage.setScene(s);
        primaryStage.setTitle("Dessin 2D");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

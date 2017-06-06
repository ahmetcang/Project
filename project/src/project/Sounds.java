/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 *
 * @author Ahmetcan
 */
public class Sounds {
    MediaPlayer bdo;
    MediaPlayer bre;
    MediaPlayer bmi;
    MediaPlayer bfa;
    MediaPlayer bsol;
    MediaPlayer bla;
    MediaPlayer bsi;
    MediaPlayer bkdo;

    public Sounds() {
        File do1 = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\Do.mp3");
        File re = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\Re.mp3");
        File mi = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\Mi.mp3");
        File fa = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\Fa.mp3");
        File sol = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\Sol.mp3");
        File la = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\La.mp3");
        File si = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\Si.mp3");
        File kdo = new File("C:\\Users\\Ahmetcan\\Documents\\NetBeansProjects\\project\\sounds\\KalınDo.mp3");
        
        Media fdo = new Media(do1.toURI().toString());
        Media fre = new Media(re.toURI().toString());
        Media fmi = new Media(mi.toURI().toString());
        Media ffa = new Media(fa.toURI().toString());
        Media fsol = new Media(sol.toURI().toString());
        Media fla = new Media(la.toURI().toString());
        Media fsi = new Media(si.toURI().toString());
        Media fkdo = new Media(kdo.toURI().toString());
        
        
        bdo = new MediaPlayer(fdo);
        bre = new MediaPlayer(fre);
        bmi = new MediaPlayer(fmi);
        bfa = new MediaPlayer(ffa);
        bsol = new MediaPlayer(fsol);
        bla = new MediaPlayer(fla);
        bsi = new MediaPlayer(fsi);
        bkdo = new MediaPlayer(fkdo);
    }
    
    void play(int i){
        
        switch(i){
        
        
            case 1:
                bdo.play();
                break;
                
            case 2:
                bre.play();
                break;
                
            case 3:
                bmi.play();
                break;
                
            case 4:
                bfa.play();
                break;
             
            case 5:
                bsol.play();
                break;
                
            case 6:
                bla.play();
                break;
                
            case 7:
                bsi.play();
                break;
               
            case 8:
                bkdo.play();
                break;
                
                
        }
        
    }
}

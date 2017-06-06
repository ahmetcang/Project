/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Ahmetcan
 */
public class FXMLDocumentController implements Initializable {
    
    
    Sounds n;
    
    
    @FXML
    private Rectangle box9;

    @FXML
    private Rectangle box7;

    @FXML
    private Rectangle box8;

    @FXML
    private Rectangle box5;

    @FXML
    private Rectangle box6;

    @FXML
    private Rectangle box3;

    @FXML
    private Rectangle box4;

    @FXML
    private Rectangle box1;

    @FXML
    private Rectangle box2;

    public Rectangle[] rect;
    
    @FXML
    void clicked(KeyEvent event) {
        n = new Sounds();
        if (event.getCharacter().charAt(0) == '1'){
            changeColor(box1);
            n.play(1);
            
        }
        else if (event.getCharacter().charAt(0) == '2'){
            changeColor(box2);
            n.play(2);
        }
        else if (event.getCharacter().charAt(0) == '3'){
            changeColor(box3);
            n.play(3);
        }
        else if (event.getCharacter().charAt(0) == '4'){
            changeColor(box4);
            n.play(4);
        }
        else if (event.getCharacter().charAt(0) == '5'){
            changeColor(box5);
            n.play(5);
        }
        else if (event.getCharacter().charAt(0) == '6'){
            changeColor(box6);
            n.play(6);
        }
        else if (event.getCharacter().charAt(0) == '7'){
            changeColor(box7);
            n.play(7);
        }
        else if (event.getCharacter().charAt(0) == '8'){
            changeColor(box8);
            n.play(8);
            
        }
        else if (event.getCharacter().charAt(0) == '9'){
            changeColor(box9);
            n.play(9);
        }
        
    }
    
    public void changeColor(Rectangle a){
        
        for(int i = 0; i < 9; i++){
            
            if (rect[i] == a){  
                a.setFill(Color.BLACK);
                continue;
            }
            else
                rect[i].setFill(Color.DODGERBLUE);
                
        }
    }

    
    void play(String i){
    
        
    }
    
    
    
    
    @FXML
    void play1(MouseEvent event) {
        n = new Sounds();
        changeColor(box1);
        n.play(1);
    }

   
    @FXML
    void play3(MouseEvent event) {
        n = new Sounds();
        changeColor(box3);
        n.play(3);
    }

    

    @FXML
    void play2(MouseEvent event) {
        n = new Sounds();
        changeColor(box2);
        n.play(2);
    }

    

    @FXML
    void play4(MouseEvent event) {
        n = new Sounds();
        changeColor(box4);
        n.play(4);
    }

    

    @FXML
    void play6(MouseEvent event) {
        n = new Sounds();
        changeColor(box6);
        n.play(6);
    }

    

    @FXML
    void play5(MouseEvent event) {
        n = new Sounds();
        changeColor(box5);
        n.play(5);
    }

    

    @FXML
    void play7(MouseEvent event) {
        n = new Sounds();
        changeColor(box7);
        n.play(7);
    }

   

    @FXML
    void play8(MouseEvent event) {
        n = new Sounds();
        changeColor(box8);
        n.play(8);
    }

    

    @FXML
    void play9(MouseEvent event) {
        n = new Sounds();
        changeColor(box9);
        n.play(9);  
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        rect = new Rectangle[]{box1,box2,box3,box4,box5,box6,box7,box8,box9};
        box1.requestFocus();
    }    
    
}

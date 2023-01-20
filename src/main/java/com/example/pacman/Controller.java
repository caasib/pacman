package com.example.pacman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;

public class Controller {

    @FXML
    private Button upButton, leftButton, rightButton, downButton;
    @FXML
    private Arc pacman;
    private double x, y;

    @FXML
    public void up(MouseEvent e) {
        pacman.setCenterY(y-=1);
    }
    public void down(MouseEvent e) {
        pacman.setCenterY(y+=1);
    }
    public void left(MouseEvent e) {
        pacman.setCenterX(x-=1);
    }
    public void right(MouseEvent e) {
        pacman.setCenterX(x+=1);
    }
}
package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class fxController {
    // Temp examples

    @FXML
    private Label answerLabel;

//BUTTONS
    @FXML
    protected void toggleButtonClicked(){
        answerLabel.setText("Toggle Clicked");

}

    @FXML
    protected void button0Clicked(){
        answerLabel.setText("Button0 clicked");

    }
    @FXML
    protected void button1Clicked(){
        answerLabel.setText("Button1 clicked");

    }
    @FXML
    protected void button2Clicked(){
        answerLabel.setText("Button2 clicked");

    }
    @FXML
    protected void button3Clicked(){
        answerLabel.setText("Button3 clicked");
//END BUTTONS - START MATH WITH 2 OBJECTS
    }
    @FXML
    protected void additionButtonClicked(){
        answerLabel.setText("addition clicked");

    }
    @FXML
    protected void subtractionButtonClicked(){
        answerLabel.setText("subtraction clicked");

    }
    @FXML
    protected void multiplicationButtonClicked(){
        answerLabel.setText("multiplication clicked");

    }
    @FXML
    protected void divisionButtonClicked(){
        answerLabel.setText("division clicked");

    }
    //END MATH WITH 2 OBJECTS - START MATH WITH SINGLE OBJECT

    @FXML
    protected void squareRootButtonClicked(){
        answerLabel.setText("square Root clicked");

    }
    @FXML
    protected void squaredButtonClicked(){
        answerLabel.setText("Squared clicked");

    }

    @FXML
    protected void calculateButtonClicked(){
        answerLabel.setText("calculate clicked");

    }

}
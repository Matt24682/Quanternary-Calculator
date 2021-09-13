package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Arrays;
import java.util.List;

public class fxController {
    // Temp examples

    @FXML
    private Label answerLabel;

    private final StringBuilder userInput= new StringBuilder("0");

//BUTTONS
    @FXML
    protected void toggleButtonClicked(){
        answerLabel.setText("Toggle Clicked");

}

    @FXML
    protected void button0Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("0");
        answerLabel.setText(userInput.toString());

    }
    @FXML
    protected void button1Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("1");
        answerLabel.setText(userInput.toString());

    }
    @FXML
    protected void button2Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("2");
        answerLabel.setText(userInput.toString());

    }
    @FXML
    protected void button3Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("3");
        answerLabel.setText(userInput.toString());
//END BUTTONS - START MATH WITH 2 OBJECTS
    }
    @FXML
    protected void additionButtonClicked(){
        userInput.append("+");
        answerLabel.setText(userInput.toString());
    }
    @FXML
    protected void subtractionButtonClicked(){
        userInput.append("-");
        answerLabel.setText(userInput.toString());
    }
    @FXML
    protected void multiplicationButtonClicked(){
        userInput.append("x");
        answerLabel.setText(userInput.toString());
    }
    @FXML
    protected void divisionButtonClicked(){
        userInput.append("÷");
        answerLabel.setText(userInput.toString());
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
        if (userInput.toString().contains("+")) {
            char lastChar = userInput.charAt(userInput.length()-1);
            if (lastChar=='+'){
                userInput.append("0");
            }
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[+=]");
            List<String> listString = Arrays.stream(splitString).toList();
            String firstValue = listString.get(0);
            String secondValue = listString.get(1);
            String finalValue = Calculator.addition(firstValue, secondValue);
            answerLabel.setText(finalValue);
            userInput.replace(0, userInput.length(), "0");

        }else if (userInput.toString().contains("-")){
            char lastChar = userInput.charAt(userInput.length()-1);
            if (lastChar=='-'){
                userInput.append("0");
            }
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[-=]");
            List<String> listString = Arrays.stream(splitString).toList();
            String firstValue = listString.get(0);
            String secondValue = listString.get(1);
            String finalValue = Calculator.subtraction(firstValue, secondValue);
            answerLabel.setText(finalValue);
            userInput.replace(0, userInput.length(), "0");
        }else if (userInput.toString().contains("x")){
            char lastChar = userInput.charAt(userInput.length()-1);
            if (lastChar=='x'){
                userInput.append("0");
            }
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[x=]");
            List<String> listString = Arrays.stream(splitString).toList();
            String firstValue = listString.get(0);
            String secondValue = listString.get(1);
            String finalValue = Calculator.multiplication(firstValue, secondValue);
            answerLabel.setText(finalValue);
            userInput.replace(0, userInput.length(), "0");
        }else if (userInput.toString().contains("÷")) {
            char lastChar = userInput.charAt(userInput.length()-1);
            if (lastChar=='÷'){
                userInput.append("0");
            }
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[÷=]");
            List<String> listString = Arrays.stream(splitString).toList();
            String firstValue = listString.get(0);
            String secondValue = listString.get(1);
            String finalValue = Calculator.division(firstValue, secondValue);
            answerLabel.setText(finalValue);
            userInput.replace(0, userInput.length(), "0");
        }
        else {
            answerLabel.setText("Not operational variable yet.");
        }

    }

}
package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Arrays;
import java.util.List;

public class fxController {

    @FXML
    private Label answerLabel;
    @FXML
    private Button additionButton;
    @FXML
    private Button subtractionButton;
    @FXML
    private Button divisionButton;
    @FXML
    private Button multiplicationButton;
    @FXML
    private Button squaredButton;
    @FXML
    private Button squareRootButton;
    @FXML
    private Button toggleUnitButton;
    @FXML
    private Button calculate;
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    private final StringBuilder userInput= new StringBuilder("0");

    private Boolean isToggled = false;

//BUTTONS
    @FXML
    protected void toggleButtonClicked(){
        if (!isToggled){
            quaternaryConversionIfStatements();
        }else{
            standardConversionIfStatements();
        }
}

    protected void quaternaryConversionIfStatements(){
        if (userInput.toString().contains("+")||userInput.toString().contains("-")
                ||userInput.toString().contains("x")||userInput.toString().contains("÷")) {
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[+x÷-]");
            List<String> listString = Arrays.stream(splitString).toList();
            String firstValue = listString.get(0);
            String secondValue = listString.get(1);
            String convertedFirstValue = Calculator.ConversionToStandard(firstValue);
            String convertedSecondValue = Calculator.ConversionToStandard(secondValue);
            if (userInput.toString().contains("+")) {
                userInput.delete(0, userInput.length());
                userInput.append(convertedFirstValue).append("+").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());

            }else if (userInput.toString().contains("-")){
                userInput.delete(0,userInput.length());
                userInput.append(convertedFirstValue).append("-").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());

            }else if (userInput.toString().contains("x")){
                userInput.delete(0,userInput.length());
                userInput.append(convertedFirstValue).append("x").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());

            }else if (userInput.toString().contains("÷")) {
                userInput.delete(0,userInput.length());
                userInput.append(convertedFirstValue).append("÷").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());

            }

        }else if (userInput.toString().contains("√")||userInput.toString().contains("²")){
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[√²]");
            List<String> listString = Arrays.stream(splitString).toList();
            if (userInput.toString().contains("√")){
                String value = listString.get(1);
                String standardValue = Calculator.ConversionToStandard(value);
                userInput.delete(0,userInput.length());
                userInput.append("√").append(standardValue);
                answerLabel.setText(userInput.toString());


            }else if (userInput.toString().contains("²")){
                String value = listString.get(0);
                String standardValue = Calculator.ConversionToStandard(value);
                userInput.delete(0,userInput.length());
                userInput.append(standardValue).append("²");
                answerLabel.setText(userInput.toString());

            }

        }else{
            String Converted = Calculator.ConversionToStandard(answerLabel.getText());
            answerLabel.setText(Converted);
        }
        isToggled=true;
        toggleDisableNumbersButtons(true);
        toggleDisableOperationButtons(true);
        toggleDisableCalculateButton(true);
    }

    protected void standardConversionIfStatements(){
        if (userInput.toString().contains("+")||userInput.toString().contains("-")
                ||userInput.toString().contains("x")||userInput.toString().contains("÷")) {
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[+x÷-]");
            List<String> listString = Arrays.stream(splitString).toList();
            String firstValue = listString.get(0);
            String secondValue = listString.get(1);
            String convertedFirstValue = Calculator.ConversionToQuaternary(firstValue);
            String convertedSecondValue = Calculator.ConversionToQuaternary(secondValue);
            if (userInput.toString().contains("+")) {
                userInput.delete(0, userInput.length());
                userInput.append(convertedFirstValue).append("+").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());

            }else if (userInput.toString().contains("-")){
                userInput.delete(0,userInput.length());
                userInput.append(convertedFirstValue).append("-").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());


            }else if (userInput.toString().contains("x")){
                userInput.delete(0,userInput.length());
                userInput.append(convertedFirstValue).append("x").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());


            }else if (userInput.toString().contains("÷")) {
                userInput.delete(0,userInput.length());
                userInput.append(convertedFirstValue).append("÷").append(convertedSecondValue);
                answerLabel.setText(userInput.toString());

            }

        }else if (userInput.toString().contains("√")||userInput.toString().contains("²")){
            String stringInput = userInput.toString();
            String[] splitString = stringInput.split("[√²]");
            List<String> listString = Arrays.stream(splitString).toList();
            if (userInput.toString().contains("√")){
                String value = listString.get(1);
                String standardValue = Calculator.ConversionToQuaternary(value);
                userInput.delete(0,userInput.length());
                userInput.append("√").append(standardValue);
                answerLabel.setText(userInput.toString());

            }else if (userInput.toString().contains("²")){
                String value = listString.get(0);
                String standardValue = Calculator.ConversionToQuaternary(value);
                userInput.delete(0,userInput.length());
                userInput.append(standardValue).append("²");
                answerLabel.setText(userInput.toString());
            }

        }else{
            String Converted = Calculator.ConversionToQuaternary(answerLabel.getText());
            answerLabel.setText(Converted);
            toggleDisableOperationButtons(false);
        }
        isToggled=false;
        if(userInput.toString().contains("²")){
            toggleDisableNumbersButtons(true);
            toggleDisableCalculateButton(false);
        }else{
            toggleDisableNumbersButtons(false);
            toggleDisableCalculateButton(false);
        }
    }

    @FXML
    protected void clearButtonClicked(){
        userInput.delete(0, userInput.length());
        userInput.append("0");
        answerLabel.setText(userInput.toString());
        isToggled = false;
        toggleDisableOperationButtons(false);
        toggleDisableNumbersButtons(false);
        toggleDisableConvertButton(false);
        toggleDisableCalculateButton(false);
    }

    @FXML
    protected void button0Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("0");
        answerLabel.setText(userInput.toString());
        toggleDisableConvertButton(false);

    }
    @FXML
    protected void button1Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("1");
        answerLabel.setText(userInput.toString());
        toggleDisableConvertButton(false);

    }
    @FXML
    protected void button2Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("2");
        answerLabel.setText(userInput.toString());
        toggleDisableConvertButton(false);

    }
    @FXML
    protected void button3Clicked(){
        String firstValue = userInput.toString();
        if (firstValue.equals("0")){
            userInput.delete(0,1);
        }
        userInput.append("3");
        answerLabel.setText(userInput.toString());
        toggleDisableConvertButton(false);
    }

    protected void toggleDisableOperationButtons(Boolean state){
        additionButton.setDisable(state);
        subtractionButton.setDisable(state);
        divisionButton.setDisable(state);
        multiplicationButton.setDisable(state);
        squaredButton.setDisable(state);
        squareRootButton.setDisable(state);

    }

    protected void toggleDisableNumbersButtons(Boolean state){
        button0.setDisable(state);
        button1.setDisable(state);
        button2.setDisable(state);
        button3.setDisable(state);
    }

    protected void toggleDisableConvertButton(Boolean state){
        toggleUnitButton.setDisable(state);
    }

    protected void toggleDisableCalculateButton(Boolean state){
        calculate.setDisable(state);
    }

//END BUTTONS - START MATH WITH 2 OBJECTS

    @FXML
    protected void additionButtonClicked(){
        userInput.append("+");
        answerLabel.setText(userInput.toString());
        toggleDisableOperationButtons(true);
        toggleDisableConvertButton(true);
    }
    @FXML
    protected void subtractionButtonClicked(){
        userInput.append("-");
        answerLabel.setText(userInput.toString());
        toggleDisableOperationButtons(true);
        toggleDisableConvertButton(true);
    }
    @FXML
    protected void multiplicationButtonClicked(){
        userInput.append("x");
        answerLabel.setText(userInput.toString());
        toggleDisableOperationButtons(true);
        toggleDisableConvertButton(true);
    }
    @FXML
    protected void divisionButtonClicked(){
        userInput.append("÷");
        answerLabel.setText(userInput.toString());
        toggleDisableOperationButtons(true);
        toggleDisableConvertButton(true);
    }
    //END MATH WITH 2 OBJECTS - START MATH WITH SINGLE OBJECT

    @FXML
    protected void squareRootButtonClicked(){
        String prevUserInput = answerLabel.getText();
        userInput.delete(0,userInput.length());
        userInput.append("√");
        userInput.append(prevUserInput);
        if (userInput.toString().contains("A")){
            userInput.delete(1, userInput.length());
            userInput.append("0");
        }
        answerLabel.setText(userInput.toString());
        toggleDisableOperationButtons(true);

    }
    @FXML
    protected void squaredButtonClicked(){
        userInput.append("²");
        answerLabel.setText(userInput.toString());
        toggleDisableOperationButtons(true);
        toggleDisableNumbersButtons(true);

    }

    //END MATH WITH SINGLE OBJECT - START CALCULATION OF OBJECT(S)
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
            if (finalValue.contains("Divide by zero!")){
                toggleDisableConvertButton(true);
            }
            userInput.replace(0, userInput.length(), "0");

        }else if (userInput.toString().contains("√")) {
            String stringInput = userInput.toString();
            String firstValue = stringInput.substring(1);
            String finalValue = Calculator.squareRoot(firstValue);
            answerLabel.setText(finalValue);
            userInput.replace(0, userInput.length(), "0");

        }else if (userInput.toString().contains("²")) {
            String stringInput = userInput.toString();
            String firstValue = stringInput.substring(0,stringInput.length()-1);
            String finalValue = Calculator.square(firstValue);
            answerLabel.setText(finalValue);
            userInput.replace(0, userInput.length(), "0");

        }
        toggleDisableOperationButtons(false);
        toggleDisableNumbersButtons(false);
        isToggled = false;

    }

}
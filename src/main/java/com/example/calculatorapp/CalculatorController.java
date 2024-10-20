package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static com.example.calculatorapp.Calculator.calculate;
import static com.example.calculatorapp.Calculator.getSampleSubstring;

public class CalculatorController {
    private Calculator calculator = new Calculator();
    private String ScreenText = "";
    boolean preResultEnable=false;

    @FXML
    public TextArea ScreenField;
    @FXML
    public Label PreResult;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btnEqual;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnPlus;
    @FXML
    private Button btnMinus;
    @FXML
    private Button btnMultiply;
    @FXML
    private Button btnDivide;

    @FXML
    void btn1Click() {
        ScreenText = ScreenText + "1";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn2Click() {
        ScreenText = ScreenText + "2";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn3Click() {
        ScreenText = ScreenText + "3";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn4Click() {
        ScreenText = ScreenText + "4";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn5Click() {
        ScreenText = ScreenText + "5";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn6Click() {
        ScreenText = ScreenText + "6";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn7Click() {
        ScreenText = ScreenText + "7";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn8Click() {
        ScreenText = ScreenText + "8";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn9Click() {
        ScreenText = ScreenText + "9";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btn0Click() {
        ScreenText = ScreenText + "0";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btnPlusClick() {
        if(preResultEnable)
            PreResult.setText(calculate(ScreenText));
        preResultEnable=true;
        ScreenText = ScreenText + "+";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btnMinusClick() {
        if(preResultEnable)
            PreResult.setText(calculate(ScreenText));
        preResultEnable=true;
        ScreenText = ScreenText + "-";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btnMultiplyClick() {
        if(preResultEnable)
            PreResult.setText(calculate(ScreenText));
        preResultEnable=true;
        ScreenText = ScreenText + "*";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btnDivideClick() {
        if(preResultEnable)
            PreResult.setText(calculate(ScreenText));
        preResultEnable=true;
        ScreenText = ScreenText + "/";
        ScreenField.setText(ScreenText);
    }

    @FXML
    protected void btnEqualClick() {
        ScreenField.setText(calculate(ScreenText));
        ScreenText = calculate(ScreenText);
        PreResult.setText("");
        preResultEnable=false;
    }

    @FXML
    protected void btnClearClick() {
        ScreenField.setText("");
        ScreenText="";
    }
}
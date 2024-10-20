module com.example.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.calculatorapp to javafx.fxml;
    exports com.example.calculatorapp;
}
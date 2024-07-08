module com.example.restau {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.restau to javafx.fxml;
    exports com.example.restau;
    opens com.example.restau.controllers to javafx.fxml;
    exports com.example.restau.controllers;
    opens com.example.restau.models to javafx.base;
    exports com.example.restau.models;
}
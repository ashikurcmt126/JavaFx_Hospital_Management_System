package com.example.javafx_hospital_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label label;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtMobile;

    @FXML
    private TextField txtDepartment;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> IDColmn;

    @FXML
    private TableColumn<?, ?> NameColmn;

    @FXML
    private TableColumn<?, ?> MobileColmn;

    @FXML
    private TableColumn<?, ?> DepartmentColmn;

}
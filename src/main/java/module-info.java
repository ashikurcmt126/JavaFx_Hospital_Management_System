module com.example.javafx_hospital_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_hospital_management_system to javafx.fxml;
    exports com.example.javafx_hospital_management_system;
}
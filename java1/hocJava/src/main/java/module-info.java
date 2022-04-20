module com.example.hocjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hocjava to javafx.fxml;
    exports com.example.hocjava;
}
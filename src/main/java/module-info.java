module com.example.firstgithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstgithub to javafx.fxml;
    exports com.example.firstgithub;
}
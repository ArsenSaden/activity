module com.example.week10ex206 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week10ex206 to javafx.fxml;
    exports com.example.week10ex206;
}
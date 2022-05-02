module com.example.week6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week6 to javafx.fxml;
    exports com.example.week6;
}
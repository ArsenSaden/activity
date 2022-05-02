module com.example.week13ex3011 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week13ex3011 to javafx.fxml;
    exports com.example.week13ex3011;
}
module com.example.week13ex304 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week13ex304 to javafx.fxml;
    exports com.example.week13ex304;
}
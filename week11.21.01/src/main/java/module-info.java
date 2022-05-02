module com.example.week112101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week112101 to javafx.fxml;
    exports com.example.week112101;
}
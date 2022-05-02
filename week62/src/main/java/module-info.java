module com.example.week62 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week62 to javafx.fxml;
    exports com.example.week62;
}
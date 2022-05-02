module com.example.week82 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week82 to javafx.fxml;
    exports com.example.week82;
}
module com.example.week14ex314 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week14ex314 to javafx.fxml;
    exports com.example.week14ex314;
}
module com.example.wee10ex201 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wee10ex201 to javafx.fxml;
    exports com.example.wee10ex201;
}
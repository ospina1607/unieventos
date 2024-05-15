module com.example.unievents01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.unievents01 to javafx.fxml;
    exports com.example.unievents01;
}
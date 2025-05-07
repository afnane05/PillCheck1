module com.pillcheck1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pillcheck1 to javafx.fxml;
    exports com.pillcheck1;
}

module com.mycompany.lab6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab6 to javafx.fxml;
    exports com.mycompany.lab6;
}

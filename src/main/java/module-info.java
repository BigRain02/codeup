module com.example.codeup {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.algorithm to javafx.fxml;
    exports com.example.algorithm;
}
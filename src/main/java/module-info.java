module com.example.decorator {
    requires javafx.controls;
    requires javafx.fxml;


    opens DesignPatterns.Decorator to javafx.fxml;
    exports DesignPatterns.Decorator;
}
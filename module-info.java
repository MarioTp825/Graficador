module MenuItems {
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.controls;

    exports Controllers to javafx.fxml, com.jfoenix, javafx.controls;
    exports Collection;

    opens Controllers to javafx.fxml, com.jfoenix, javafx.controls;
    opens Collection to javafx.fxml;
}
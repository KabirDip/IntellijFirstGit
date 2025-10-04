module org.example.firstgituse {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.firstgituse to javafx.fxml;
    exports org.example.firstgituse;
}
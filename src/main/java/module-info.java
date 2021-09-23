module com.example.formulariocadastrofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.formulariocadastrofx to javafx.fxml;
    exports com.example.formulariocadastrofx;
}
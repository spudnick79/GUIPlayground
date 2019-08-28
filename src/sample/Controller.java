package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {   // In scene builder hit view and click skeleton and copy

    @FXML
    private TextField txtName;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lblName;

    @FXML
    void showName(MouseEvent event) {
        String name;
        name = txtName.getText();
    System.out.println(name);
    lblName.setText(name);
    }

}
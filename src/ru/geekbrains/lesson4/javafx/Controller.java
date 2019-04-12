package ru.geekbrains.lesson4.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public TextArea messages;

    @FXML
    public TextField messageText;

    private Stage primaryStage;

    void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void onSendClicked() {
        // TODO реализовать добавление сообщений в TextArea messages

        messages.appendText(messageText.getText()+"\n");
        messageText.clear();
        messageText.requestFocus();



        showModalAlert("Network chat",
                "Message",
                "Message text",
                Alert.AlertType.INFORMATION);
    }

    private static void showModalAlert(String title, String header, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);

        alert.showAndWait();
    }
}

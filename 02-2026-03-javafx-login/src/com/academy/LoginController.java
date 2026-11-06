package com.academy;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin() {
        animateButton();

        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Compila sia username che password.");
            showAlert(Alert.AlertType.WARNING, "Campi mancanti", "Inserisci username e password.");
            return;
        }

        if ("admin".equals(username) && "1234".equals(password)) {
            messageLabel.setStyle("-fx-text-fill: #d4ffd4; -fx-font-size: 12px; -fx-font-weight: bold;");
            messageLabel.setText("Accesso effettuato con successo.");
            showAlert(Alert.AlertType.INFORMATION, "Login OK", "Benvenuto nell'area riservata.");
        } else {
            messageLabel.setStyle("-fx-text-fill: #ffdddd; -fx-font-size: 12px; -fx-font-weight: bold;");
            messageLabel.setText("Credenziali non corrette.");
            showAlert(Alert.AlertType.ERROR, "Login fallito", "Username o password errati.");
        }
    }

    private void animateButton() {
        ScaleTransition st = new ScaleTransition(Duration.millis(120), loginButton);
        st.setFromX(1.0);
        st.setFromY(1.0);
        st.setToX(0.95);
        st.setToY(0.95);
        st.setCycleCount(2);
        st.setAutoReverse(true);
        st.play();
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

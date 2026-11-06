package com.library.app;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LibraryController {
    @FXML
    private TextField titleField;
    @FXML private TextField authorField;
    @FXML private TextField yearField;
    @FXML private TextField genreField;
    @FXML private Label displayLabel;

    @FXML
    public void initialize() {
        updateDisplay();
    }

    @FXML
    private void handleAddNovel() {
        String title = titleField.getText().trim();
        String author = authorField.getText().trim();
        int year;
        try {
            year = Integer.parseInt(yearField.getText().trim());
        } catch (NumberFormatException e) {
            year = 0;
        }
        String genre = genreField.getText().trim();

        Book newBook = new Novel(title, author, year, genre, false);
        CollectionManager.add(newBook);

        showAlert("Success", "Novel added successfully!");
        updateDisplay();
    }

    @FXML
    private void handleSave() {
        CollectionManager.saveToFile();
        showAlert("Information", "Collection saved to text file.");
    }

    private void updateDisplay() {
        String text = "";
        for (Book b : CollectionManager.getBooks()) {
            text += b.getDetails() + ": \n";
        }
        displayLabel.setText(text);
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

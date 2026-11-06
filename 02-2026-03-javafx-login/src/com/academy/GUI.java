package com.academy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(GUI.class.getResource("/com/academy/login.fxml"));
        Scene scene = new Scene(loader.load(), 500, 450);

        stage.setTitle("Login ITS Umbria Academy");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

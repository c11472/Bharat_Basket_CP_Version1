package com.bharatbasket.desktop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BharatBasketDesktopApplication extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("BharatBasket");
        stage.setScene(new Scene(new StackPane(new Label("Welcome to BharatBasket")), 640, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

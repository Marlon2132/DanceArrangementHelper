package com.github.marlon2132.dancearrangementhelper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DAH_Application extends Application {
    private Stage main_stage_;
    private BorderPane main_window_layout_;

    @Override
    public void start(Stage main_stage) throws IOException {
        this.main_stage_ = main_stage;
        this.main_stage_.setTitle("DAH");

        initMainWindowLayout();
        initDanceStageLayout();
    }

    public void initMainWindowLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(DAH_Application.class.getResource("main-window.fxml"));
            main_window_layout_ = (BorderPane) loader.load();
            Scene scene = new Scene(main_window_layout_);
            main_stage_.setScene(scene);
            main_stage_.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initDanceStageLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(DAH_Application.class.getResource("dance-stage.fxml"));
            AnchorPane dance_stage = (AnchorPane) loader.load();
            main_window_layout_.setCenter(dance_stage);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

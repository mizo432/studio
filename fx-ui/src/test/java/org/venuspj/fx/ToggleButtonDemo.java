package org.venuspj.fx;

import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXToggleNode;
import de.jensd.fx.fontawesome.Icon;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ToggleButtonDemo  extends Application {
    private static ConfigurableApplicationContext context;

    @Value("${app.ui.title:Example App}")//
    private String windowTitle;

    private VBox pane;

    @Override
    public void start(Stage stage) throws Exception {
        // ★自作の FXMLLoader を Spring のコンテナから取得
        MySpringFXMLLoader loader = context.getBean(MySpringFXMLLoader.class);

        // ★fxml をロード
        Parent root = loader.load("sample.fxml");

        // ★あとは普通の JavaFX と同じ

        pane = new VBox();
        pane.setSpacing(30);
        pane.setStyle("-fx-background-color:#EEE; -fx-padding: 40;");

        ToggleButton button = new ToggleButton("JavaFx Toggle");
        pane.getChildren().add(button);

        JFXToggleButton toggleButton = new JFXToggleButton();
        toggleButton.setText("New Skin");
        pane.getChildren().add(toggleButton);

        JFXToggleNode node = new JFXToggleNode();
        Icon value = new Icon("HEART");
        value.setPadding(new Insets(10));
        node.setGraphic(value);

        pane.getChildren().add(node);


        final Scene scene = new Scene(pane, 600, 400, Color.valueOf("#EEE"));
        stage.setTitle("JFX Toggle Button Demo ");
        scene.getStylesheets().add(ToggleButtonDemo.class.getResource("/resources/css/jfoenix-components.css").toExternalForm());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }
    public static void main(String[] args) {
        // ★ApplicationContext は後で使うので static 変数に保存しておく
        context = SpringApplication.run(MainTest.class, args); // ★Spring Boot を起動
        launch(args); // ★JavaFX を起動
    }
}

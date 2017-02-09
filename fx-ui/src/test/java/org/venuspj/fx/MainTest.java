package org.venuspj.fx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class MainTest extends Application {
    private static ConfigurableApplicationContext context;

    @Value("${app.ui.title:Example App}")//
    private String windowTitle;

    public static void main(String[] args) throws IOException {
        // ★ApplicationContext は後で使うので static 変数に保存しておく
        context = SpringApplication.run(MainTest.class, args); // ★Spring Boot を起動
        launch(args); // ★JavaFX を起動
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // ★自作の FXMLLoader を Spring のコンテナから取得
        MySpringFXMLLoader loader = context.getBean(MySpringFXMLLoader.class);

        // ★fxml をロード
        Parent root = loader.load("sample.fxml");

        // ★あとは普通の JavaFX と同じ
        Scene scene = new Scene(root);
        primaryStage.setTitle(windowTitle);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        context.close(); // ★アプリ終了時に stop() メソッドがコールバックされるので、 Spring コンテナを終了させる
    }
}

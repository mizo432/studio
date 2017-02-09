package org.venuspj.fx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component // ★コンポーネントとして登録
public class MySpringFXMLLoader {
    @Autowired
    private ApplicationContext context;

    public Parent load(String path) throws IOException {
        FXMLLoader loader = new FXMLLoader(); // ★オリジナルの FXMLLoader を生成

        loader.setControllerFactory(this.context::getBean); // ★ControllerFactory に ApplicationContext を利用する

        return loader.load(MySpringFXMLLoader.class.getClassLoader().getResourceAsStream(path));
    }}

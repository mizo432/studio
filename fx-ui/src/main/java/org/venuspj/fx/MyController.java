package org.venuspj.fx;

import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.scene.control.Label;

@Component
public class MyController {

    @Autowired
    private DummyService dummyService;

    @FXML
    private Label label;

    @Autowired
    private MyBean bean;

    @FXML
    public void onClickButton() {
        dummyService.write();
        String text = this.bean.getText();
        this.label.setText(text);
    }
}

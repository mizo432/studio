package org.venuspj.studio.adapter.presenters;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;

public interface SpringView<D> extends View<D> {
    String getTemplatePath();

    SpringView<D> bind(Model aModel);
}

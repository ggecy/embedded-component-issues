package org.vaadin.example;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class ManViewExporter extends WebComponentExporter<MainView> {

    public ManViewExporter() {
        super("commons-template-main-view");
    }

    @Override
    protected void configureInstance(WebComponent<MainView> webComponent, MainView mainView) {

    }
}

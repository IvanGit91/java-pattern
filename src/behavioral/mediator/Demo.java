package behavioral.mediator;

import behavioral.mediator.components.*;
import behavioral.mediator.mediator.Editor;
import behavioral.mediator.mediator.Mediator;

import javax.swing.*;

/*
Mediator is a behavioral design pattern that reduces coupling between components of a program by making them communicate indirectly, through a special mediator object.

The Mediator makes it easy to modify, extend and reuse individual components because they’re no longer dependent on the dozens of other classes.

Usage examples: The most popular usage of the Mediator pattern in Java code is facilitating communications between GUI components of an app.
The synonym of the Mediator is the Controller part of MVC pattern.
*/

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
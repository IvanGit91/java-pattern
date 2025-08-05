package creational.factory.sample1.factory;

import creational.factory.sample1.buttons.Button;
import creational.factory.sample1.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
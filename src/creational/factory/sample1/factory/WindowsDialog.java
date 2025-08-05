package creational.factory.sample1.factory;

import creational.factory.sample1.buttons.Button;
import creational.factory.sample1.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
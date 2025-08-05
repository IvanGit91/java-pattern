package creational.factory.sample1;

import creational.factory.sample1.factory.Dialog;
import creational.factory.sample1.factory.HtmlDialog;
import creational.factory.sample1.factory.WindowsDialog;

/*
Factory method is a creational design pattern which solves the problem
of creating product objects without specifying their concrete classes.

The Factory Method defines a method, which should be used for creating objects instead of using a direct constructor call (new operator).
Subclasses can override this method to change the class of objects that will be created.

Identification: Factory methods can be recognized by creation methods that construct objects from concrete classes.
While concrete classes are used during the object creation, the return type of the factory methods is usually declared as either an abstract class or an interface.

Summary:
subclass: override a method to change the class that will be created
return: abstract class or interface
use: the concrete factory is usually chosen depending on configuration or env

*/

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
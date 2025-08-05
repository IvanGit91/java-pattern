package creational.abstract_factory;

/*
* Abstract Factory is a creational design pattern, which solves the problem of creating entire product families
* without specifying their concrete classes.
*
* Abstract Factory defines an interface for creating all distinct products but leaves the actual product creation to
* concrete factory classes. Each factory type corresponds to a certain product variety.
*
* The client code calls the creation methods of a factory object instead of creating products directly with a constructor call (new operator).
* Since a factory corresponds to a single product variant, all its products will be compatible.
*
* Client code works with factories and products only through their abstract interfaces. This lets the client code work with any product variants,
* created by the factory object. You just create a new concrete factory class and pass it to the client code.
*
* Identification: The pattern is easy to recognize by methods, which return a factory object. Then, the factory is used for creating specific sub-components.
* */

import creational.abstract_factory.app.Application;
import creational.abstract_factory.factories.GUIFactory;
import creational.abstract_factory.factories.MacOSFactory;
import creational.abstract_factory.factories.WindowsFactory;

public class AbstractFactoryMain {

    /* Families of cross-platform GUI components and their production
In this example, buttons and checkboxes will act as products. They have two variants: macOS and Windows.
The abstract factory defines an interface for creating buttons and checkboxes. There are two concrete factories,
which return both products in a single variant.
Client code works with factories and products using abstract interfaces.
It makes the same client code working with many product variants, depending on the type of factory object.
*/

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}

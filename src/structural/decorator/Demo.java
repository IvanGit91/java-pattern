package structural.decorator;

/*
* Decorator is a structural pattern that allows adding new behaviors to objects dynamically by placing them inside special wrapper objects,
* called decorators.

* Using decorators you can wrap objects countless number of times since both target objects and decorators follow the same interface.
* The resulting object will get a stacking behavior of all wrappers.
* */

import structural.decorator.decorators.*;

public class Demo {
    /*
    Initially, the business logic class could only read and write data in plain text.
    Then we created several small wrapper classes that add new behavior after executing standard operations in a wrapped object.

    The first wrapper encrypts and decrypts data, and the second one compresses and extracts data.
    */
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
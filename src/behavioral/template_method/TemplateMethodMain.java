package behavioral.template_method;

import behavioral.template_method.networks.Facebook;
import behavioral.template_method.networks.Network;
import behavioral.template_method.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Template Method is a behavioral design pattern that allows you to define a skeleton of an algorithm in a base
* class and let subclasses override the steps without changing the overall algorithm’s structure.
*
* Usage examples: The Template Method pattern is quite common in Java frameworks.
* Developers often use it to provide framework users with a simple means of extending standard functionality using inheritance.
* */

public class TemplateMethodMain {
/*
    * Overriding standard steps of an algorithm
    * In this example, the Template Method pattern defines an algorithm of working with a social network.
    * Subclasses that match a particular social network, implement these steps according to the API provided by the social network.
*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}

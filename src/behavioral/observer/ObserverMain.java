package behavioral.observer;

import behavioral.observer.editor.Editor;
import behavioral.observer.listeners.EmailNotificationListener;
import behavioral.observer.listeners.LogOpenListener;

/*
 * Observer is a behavioral design pattern that allows some objects to notify other objects about changes in their state.
 * 
 * The Observer pattern provides a way to subscribe and unsubscribe to and from these events for any object that implements a subscriber interface.
 */
public class ObserverMain {
    
/*
 * In this example, the Observer pattern establishes indirect collaboration between objects of a text editor.
 * Each time the Editor object changes, it notifies its subscribers.
 * EmailNotificationListener and LogOpenListener react to these notifications by executing their primary behaviors.
 * Subscriber classes aren’t coupled to the editor class and can be reused in other apps if needed.
 * The Editor class depends only on the abstract subscriber interface. This allows adding new subscriber types without changing the editor’s code.
*/

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

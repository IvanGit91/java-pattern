package behavioral.command.sample1;

import behavioral.command.sample1.editor.Editor;

/*
 * Command is behavioral design pattern that converts requests or simple operations into objects.
 * 
 * The conversion allows deferred or remote execution of commands, storing command history, etc.
 * 
 * Usage examples: The Command pattern is pretty common in Java code. Most often it’s used as an alternative for callbacks to parameterizing UI elements with actions.
 * It’s also used for queueing tasks, tracking operations history, etc.
 * 
 * Identification: If you see a set of related classes that represent specific actions (such as “Copy”, “Cut”, “Send”, “Print”, etc.), this may be a Command pattern.
 * These classes should implement the same interface/abstract class.
 * The commands may implement the relevant actions on their own or delegate the work to separate objects—that will be the receivers.
 * The last piece of the puzzle is to identify an invoker—search for a class that accepts the command objects in the parameters of its methods or constructor.
 */
public class CommandMain {
    
/*
* Text editor commands and undo
* The text editor in this example creates new command objects each time a user interacts with it. After executing its actions, a command is pushed to the history stack.
* Now, to perform the undo operation, the application takes the last executed command from the history and either performs an inverse action or restores the past state of the editor, saved by that command. 
*/
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}

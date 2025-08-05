package behavioral.state.sample1;

import behavioral.state.sample1.ui.Player;
import behavioral.state.sample1.ui.UI;

/*
State is a behavioral design pattern that allows an object to change the behavior when its internal state changes.

The pattern extracts state-related behaviors into separate state classes and forces the original object
to delegate the work to an instance of these classes, instead of acting on its own.

Usage examples: The State pattern is commonly used in Java to convert massive switch-base state machines into objects.

Identification: The State pattern can be recognized by methods that change their behavior depending on the objects’ state.
You can confirm identification if you see that this state can be controlled or replaced by other objects, including state objects themselves.
*/
public class StateMain {
    /*
    * Interface of a media player
    * In this example, the State pattern lets the same media player controls behave differently,
    * depending on the current playback state. The main class of the player contains a reference to a state object,
    * which performs most of the work for the player. Some actions may end-up replacing the state object with another,
    * which changes the way the player reacts to the user interactions.
    */
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}

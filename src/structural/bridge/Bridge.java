package structural.bridge;

import structural.bridge.devices.Device;
import structural.bridge.devices.Radio;
import structural.bridge.devices.Tv;
import structural.bridge.remotes.AdvancedRemote;
import structural.bridge.remotes.BasicRemote;

/*
 * Bridge is a structural design pattern that divides business logic or huge class into separate class hierarchies that can be developed independently.
 * One of these hierarchies (often called the Abstraction) will get a reference to an object of the second hierarchy (Implementation). 
 * The abstraction will be able to delegate some (sometimes, most) of its calls to the implementations object. 
 * Since all implementations will have a common interface, they’d be interchangeable inside the abstraction.
 * 
 * Usage examples: The Bridge pattern is especially useful when dealing with cross-platform apps,
 * supporting multiple types of database servers or working with several API providers of a certain kind (for example, cloud platforms, social networks, etc.)
 * 
 * Identification: Bridge can be recognized by a clear distinction between some controlling entity and several different platforms that it relies on.
 */

public class Bridge {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

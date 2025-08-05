package behavioral.command.sample2;

// 5. Client Code
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightsOn = new LightOnCommand(livingRoomLight);
        Command lightsOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightsOn);
        remote.pressButton(); // Output: The light is ON

        remote.setCommand(lightsOff);
        remote.pressButton(); // Output: The light is OFF
    }
}

/*
Command: Encapsulates a request.

Receiver: Performs the actual work (Light).

ConcreteCommand: Implements the request (LightOnCommand, LightOffCommand).

Invoker: Initiates the request (RemoteControl).

Client: Configures the command objects and invokes operations.
*/
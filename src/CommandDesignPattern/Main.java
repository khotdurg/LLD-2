package CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create a Light instance
        Light light = new Light();

        // Create a command to turn on the light
        Command lightOnCommand = new LightOnCommand(light);

        // Create a remote control with the command
        RemoteControl remoteControl = new RemoteControl(lightOnCommand);

        // Press the button on the remote control to execute the command
        remoteControl.pressButton();

        // Check if the light is turned on
        if (light.isTurnedOn()) {
            System.out.println("The light is turned on.");
        } else {
            System.out.println("The light is turned off.");
        }
    }
}

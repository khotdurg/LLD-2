package CommandDesignPattern;

public class Light {
    private boolean turnedOn;

    public boolean isTurnedOn(){
        return turnedOn; //coming from line no 4
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    //receiver method: receives and acts on the command
    public void turnOn(){
        this.turnedOn = true;
        System.out.println("Light has been turned on");
    }
}

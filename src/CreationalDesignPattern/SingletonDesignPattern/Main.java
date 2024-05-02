package CreationalDesignPattern.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Car car =  Car.getInstance();
      //  Car car1 =  Car.getInstance(); //this will also return the same
    }
}

package CreationalDesignPattern.SingletonDesignPattern;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.concurrent.locks.Lock;

public class Car {
    //STATIC DATA MEMBERS
    private static Car instance; //static to create object

    //PRIVATE CONSTRUCTOR
    private Car(){ //private because we don't want to allow creating another object or instance

    }

    public static synchronized Car getInstance(){
        if(instance == null){
            instance = new Car();
        }
        return instance;
    }
}

package bicycles;

public class Bicycle {

    // Let's create public accelerate method
    public static void accelerateBicycle (int increaseSpeed){
        increaseSpeed = 5;
    }

    // Let's crease public brake method
    public static void brakeBicycle (int decreaseSpeed){
        decreaseSpeed = 3;
    }

    // Let's crease public currentSpeed method
    public static int currentSpeed (int currSpeed){
        return currSpeed;
    }

    // Let's create public stop method
    public static void stopBicycle(int stop){
        stop = 0;
    }

}


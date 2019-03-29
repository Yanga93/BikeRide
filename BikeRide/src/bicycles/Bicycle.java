package bicycles;

public class Bicycle {

    private int speed = 0;
    public int currentSpeed = 0;


    public void shouldAccelerate(int speed) {
        speed = +5;
    }

    public void shouldBrake() {
        int speed = -3;
    }

    public int currentSpeed(int currSpeed) {
        return currSpeed;
    }

    public void shouldStop() {
        int speed = 0;
    }

}

package strategy;

public class RunningStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I am running.");
    }
}

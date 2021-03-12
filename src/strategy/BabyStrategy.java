package strategy;

public class BabyStrategy implements GivingBirthStrategy {
    @Override
    public void giveBirth() {
        System.out.println("Giving Birth Baby");
    }
}

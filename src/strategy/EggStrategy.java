package strategy;

public class EggStrategy implements GivingBirthStrategy {
    @Override
    public void giveBirth() {
        System.out.println("Giving Birth Egg");
    }
}

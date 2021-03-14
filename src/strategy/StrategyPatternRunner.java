package strategy;

import runner.DesignPatternRunner;

public class StrategyPatternRunner extends DesignPatternRunner {

    public StrategyPatternRunner() {
        super("Strategy");
    }

    @Override
    protected void runInner() {
        Animal bird = new Bird("Bird");
        Animal dog = new Dog("Dog");

        bird.setGivingBirthStrategy(new EggStrategy());
        bird.setMovingStrategy(new FlyingStrategy());
        dog.setGivingBirthStrategy(new BabyStrategy());
        dog.setMovingStrategy(new RunningStrategy());

        System.out.println("--- Species 1 name: " + bird.getSpecies());
        System.out.print("--- Species 1 give birth: ");
        bird.giveBirth();
        System.out.print("--- Species 1 move: ");
        bird.move();

        System.out.println("--- Species 2 name: " + dog.getSpecies());
        System.out.print("--- Species 2 give birth: ");
        dog.giveBirth();
        System.out.print("--- Species 2 move: ");
        dog.move();
    }
}

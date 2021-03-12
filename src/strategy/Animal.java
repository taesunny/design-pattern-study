package strategy;

public abstract class Animal {
    private String species;
    private GivingBirthStrategy givingBirthStrategy;
    private MovingStrategy movingStrategy;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void giveBirth() {
        givingBirthStrategy.giveBirth();
    }

    public void move() {
        movingStrategy.move();
    }

    public void setGivingBirthStrategy(GivingBirthStrategy givingBirthStrategy) {
        this.givingBirthStrategy = givingBirthStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}

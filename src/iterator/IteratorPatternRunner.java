package iterator;

import java.util.Iterator;

import runner.DesignPatternRunner;

public class IteratorPatternRunner extends DesignPatternRunner {
    public IteratorPatternRunner() {
        super("Iterator");
    }

    @Override
    protected void runInner() {
        Fridge fridge = new Fridge(5);
        fridge.addFood(new Food("meat"));
        fridge.addFood(new Food("juice"));
        fridge.addFood(new Food("cola"));

        System.out.println("- Current Foods Number: " + fridge.getLength());

        System.out.println("Iterate Start");
        Iterator<Food> it = fridge.iterator();

        while (it.hasNext()) {
            Food food = it.next();
            System.out.println("Current Food: " + food.getName());
        }

        System.out.println("- Iterate End");
    }
}

package iterator;

import java.util.Iterator;

public class FridgeIterator implements Iterator<Food> {
    private Fridge fridge;
    private int index = 0;

    public FridgeIterator(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public boolean hasNext() {
        if (index < fridge.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Food next() {
        return fridge.get(index++);
    }

}

package iterator;

import java.util.Iterator;

public class Fridge implements Aggregate {

    private Food[] foods;
    private int last = 0;

    public Fridge(int capacity) {
        foods = new Food[capacity];
    }

    public Food get(int index) {
        return foods[index];
    }

    public void addFood(Food food) {
        foods[last++] = food;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Food> iterator() {
        return new FridgeIterator(this);
    }
}

package Test.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {
        final Item it1 = new Item(4, 20);
        final Item it2 = new Item(3, 18);
        final Item it3 = new Item(2, 14);

        final Item[] items = {it1, it2, it3};
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        final int W = 7;
        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while (currentItem < items.length && weightSoFar != W) {
            if (weightSoFar + items[currentItem].getWeigth() < W) {
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeigth();
            } else {
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeigth()) * items[currentItem].getValue();
                weightSoFar = W;
            }
            currentItem++;
        }
        System.out.println(valueSoFar);
    }
}

class Item {
    private int weigth;
    private int value;

    public Item(int weigth, int value) {
        this.weigth = weigth;
        this.value = value;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weigth=" + weigth +
                ", value=" + value +
                '}';
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weigth;
    }
}
package flowerStore;

/**
* pack of the same flowers
*/

public class FlowerPack {
    private Flower flower;
    private int amount;

    public int getPrice() {
        return (flower.getPrice() * amount);
    }
}

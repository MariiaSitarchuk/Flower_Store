package store;

//the set of the flower packs
//need to take several FlowerPack

public class FlowerBucket {
    private FlowerPack flowerPack;
    private int amount;

    public int getPrice() {
        return (flowerPack.getPrice() * amount);
    }
}

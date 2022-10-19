package store;

//the set of the flower packs
//need to take several FlowerPack

public class FlowerBucket {
    private FlowerPack flower_pack;
    private int amount;

    public int getPrice() {
        return (flower_pack.getPrice() * amount);
    }
}

package store;

/**
* pack of the same flowers
*/

public class FlowerPack {
    private Flower flower;
    private int amount;
    
    public void FlowerPack(Flower initflower, int initamount) {
        amount = initamount;
        flower = initflower;

    public int getPrice() {
        return (flower.getPrice() * amount);
    }
}

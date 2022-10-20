package store;

/**
* pack of the same flowers
*/

public class FlowerPack {
    private Flower flower;
    private int amount;
    
    public void FlowerPack(Flower initflower, int initamount) {
        this.amount = initamount;
        this.flower = initflower;

    public double getPrice() {
        return (flower.getPrice() * amount);
    }
}

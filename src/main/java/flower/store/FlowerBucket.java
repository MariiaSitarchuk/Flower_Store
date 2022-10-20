package store;
import java.util.ArrayList;

//the set of the flower packs
//need to take several FlowerPack

public class FlowerBucket {
    //private int amount;
    private final ArrayList<FlowerPack> packList = new ArrayList<FlowerPack>();

    public void add(FlowerPack newPack) {
        packList.add(newPack);
    }

    public double getPrice() {
        double sum = 0.0;
        for (FlowerPack pack : packList) {
            sum = sum + pack.getPrice();
        }
        return sum;
    }
}

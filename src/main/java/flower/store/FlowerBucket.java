package store;
import java.util.ArrayList;

//the set of the flower packs
//need to take several FlowerPack

public class FlowerBucket {
    //private int amount;
    private final ArrayList<FlowerPack> packList;
    
     public FlowerBucket() {
        this.packList = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack newPack) {
        this.packList.add(newPack);
    }

    public double getPrice() {
        double sum = 0.0;
        for (FlowerPack pack : this.packList) {
            sum = sum + pack.getPrice();
        }
        return sum;
    }
}

package store;

//the set of the flower packs
//need to take several FlowerPack

public class FlowerBucket {
    //private int amount;
    private ArrayList<FlowerPack> packList;

    public void FlowerBucket() {
        this.packList = new ArrayList<>();
    }

    public void addPack(FlowerPack newPack){
        this.packList.add(newPack);
    }

    public int getPrice() {
        int sum = 0;
        for (FlowerPack pack : packList) {
            sum = sum + pack.getPrice();
        }
        return sum;
    }
}

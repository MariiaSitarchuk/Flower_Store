package store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private int price;
//    @Getter
//    private FlowerType flowerType;
    
    public Flower() { };
    
    public Flower(double inisepalLength, FlowerColor inicolor, int iniprice) {
        setColor(inicolor);
        this.sepalLength = inisepalLength;
        this.price = iniprice;
    }
    
    public void setColor(FlowerColor col) {
        this.color = col.toString();
    }

    public String getColor() {
        return color.toString();
    }
    
    public double getPrice() {
        return price;
    }
}

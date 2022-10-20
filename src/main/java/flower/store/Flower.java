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
    
    public Flower() {};
    
    public Flower(double initsepalLength, FlowerColor initcolor, int initprice) {
        setColor(initcolor);
        this.sepalLength = initsepalLength;
        this.price = initprice;
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

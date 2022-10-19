package store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_AMOUNT = 20;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        int amount = RANDOM_GENERATOR.nextInt(MAX_AMOUNT);

        flowerPack = new FlowerPack(flower, amount);
    }

    @Test
    public void testPrice() {
        int resultPrice = price * amount;
        Assertions.assertEquals(resultPrice, flowerPack.getPrice());
    }
}

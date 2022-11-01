package store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private static final int RAN_PRICE = RANDOM_GENERATOR.nextInt(MAX_PRICE);
    private static final int RAN_QUANT = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(RAN_PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, RAN_QUANT);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(RAN_PRICE * RAN_QUANT, flowerBucket.getPrice());
    }
}

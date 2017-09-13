package de.jgehrmann.main.utils;


import java.util.Random;

public class RandomNumberGenerator {
    public static int generateInteger(int max, int min) {
        Random generator = new Random();
        return (generator.nextInt(max) + min);
    }

    public static int generateInteger() {
        return generateInteger(10, 0);
    }
}

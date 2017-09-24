package de.jgehrmann.main.utils;

import java.util.Random;

/**
 * RandomFloatGenerator generates random floating numbers.
 */
public class RandomFloatGenerator {

    /**
     * Generate a floating number between the given values.
     *
     * @param min minimum sizure.
     * @param max maximum sizure.
     * @return The random number.
     */
    public static float generate(float min, float max) {
        return new Random().nextFloat() * max + min;
    }

    /**
     * Generate a floating number between the given values.
     *
     * @param min minimum sizure.
     * @param max maximum sizure.
     * @return The random number.
     */
    public static float generate(int min, int max) {
        return generate((float) min, (float) max);
    }
}

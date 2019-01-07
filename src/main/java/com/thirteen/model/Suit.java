package com.thirteen.model;

/**
 * Represents the different suits used in playing cards.
 *
 * @author Michael Kha
 */
public enum Suit {
    SPADES,
    CLUBS,
    DIAMONDS,
    HEARTS;

    /**
     * Replaces the original enum's to string to only have the first letter
     * capitalized.
     * @return  String with only the first letter capitalized
     */
    @Override
    public String toString() {
        String original = super.toString();
        return original.substring(0, 1) + original.substring(1).toLowerCase();
    }
}

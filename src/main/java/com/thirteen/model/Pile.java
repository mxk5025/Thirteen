package com.thirteen.model;

import java.util.List;

/**
 * Represents a pile of cards.
 *
 * @author Michael Kha
 */
public class Pile extends CardModifier {

    /**
     * Create a pile of cards.
     * @param cards List of cards to refer to as the pile
     */
    public Pile(List<Card> cards) {
        this.cards = cards;
    }

}

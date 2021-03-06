package com.thirteen.model;

/**
 * Represents a single card in a typical 52-card deck.
 *
 * @author Michael Kha
 */
public class Card implements Comparable<Card> {

    /**
     * ID composed of rank and suit
     */
    private CardID ID;

    /**
     * Suit of this card
     */
    private Suit suit;

    /**
     * Rank of this card
     */
    private Rank rank;

    /**
     * Create a card with a given suit and rank.
     * @param suit  Suit of this card
     * @param rank  Rank of this card
     */
    public Card(Suit suit, Rank rank) {
        ID = new CardID(rank, suit);
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Get the card ID composed of rank and suit.
     * @return  Card ID
     */
    public CardID getID() {
        return ID;
    }

    /**
     * Get the suit of this card.
     * @return  Suit of this card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get the rank of this card.
     * @return  Rank of this card
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Get the ordinal value of the rank.
     * @return  The ordinal value
     */
    public int getRankOrdinal() {
        return rank.ordinal();
    }

    /**
     * Does the given card have the same rank as this card?
     * @param card  Card to check
     * @return  If the ranks are the same
     */
    public boolean isSameRank(Card card) {
        return rank == card.rank;
    }

    /**
     * Does this card have the specified rank and suit?
     * @param rank  Rank to check
     * @param suit  Suit to check
     * @return  If both rank and suit are equal
     */
    public boolean isRankAndSuit(Rank rank, Suit suit) {
        return this.rank == rank && this.suit == suit;
    }

    /**
     * Check if another object is equal to this card.
     * Equal is defined as having the same suit and rank.
     * @param obj   Object to check
     * @return  If the object is equal to this card
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Card) {
            Card other = (Card)obj;
            return suit == other.suit && rank == other.rank;
        }
        return false;
    }

    /**
     * Get the hash code value of the card. The value is
     * determined by the suit and rank.
     * @return  The hash code value
     */
    @Override
    public int hashCode() {
        return suit.hashCode() + rank.hashCode() * 31;
    }

    /**
     * Compare this card to another card. First compare the ranks
     * and if the ranks are equal, then compare the suits.
     * @param other Other card to compare with
     * @return  If this card is less than, equal to, or greater than
     *          return -1, 0, or 1.
     */
    @Override
    public int compareTo(Card other) {
        int rankCompare = rank.convertCompareTo(other.rank);
        return rankCompare == 0 ? suit.convertCompareTo(other.suit) : rankCompare;
    }

    /**
     * String representation of the card as you would say it normally
     * such as "Ace of Spades"
     * @return  String in the form of "Rank of Suit"
     */
    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }
}

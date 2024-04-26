package zane41.omaha.classes;

import javafx.scene.image.Image;

public class Card implements Comparable<Card>{

     public int valueForCompare; private String value; private Suit suit; private Image img;

    public Card(int valueForCompare, String value, Suit suit, Image img) {
        this.valueForCompare = valueForCompare;
        this.value = value;
        this.suit = suit;
        this.img = img;
    }

    public int getValueForCompare() {
        return valueForCompare;
    }

    public Image getImage() {
        return img;
    }

    public String getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card -" +
                 value + '\'' +
                 suit +
                ' ';
    }

    @Override
    public int compareTo(Card o) {
        if(this.valueForCompare>o.valueForCompare) return 1;
        if(this.valueForCompare<o.valueForCompare) return -1;
        else return 0;
    }
}

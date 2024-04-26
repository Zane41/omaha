package zane41.omaha.classes;

public class Card implements Comparable<Card>{

     int valueForCompare; private String value; private Suit suit; private Img img;

    public Card(int valueForCompare, String value,  Suit suit, Img img) {
        this.valueForCompare = valueForCompare;
        this.value = value;
        this.suit = suit;
        this.img = img;
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

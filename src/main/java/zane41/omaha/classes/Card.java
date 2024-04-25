package zane41.omaha.classes;

public class Card {

    private int id; private String value; private Suit suit; private Img img;

    public Card(int id, String value,  Suit suit, Img img) {
        this.id = id;
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
}

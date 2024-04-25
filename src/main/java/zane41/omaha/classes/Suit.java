package zane41.omaha.classes;

public enum Suit {
    Hearts("Hearts"), Diamonds("Diamonds"), Spades("Spades"), Clubs("Clubs");
     final String title;

    Suit(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return STR."Suit = \{title}\{'\''}";
    }
}

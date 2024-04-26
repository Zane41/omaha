package zane41.omaha.classes;

public enum ValuesOfHands {
    Kicker ("Kicker"), Pair("Pair"), TwoPairs("Two Pairs"), Set("Set"), Straight ("Straight"), Flush ("Flush"), FullHouse("Full House"),
    Quad ("Quad"), StraightFlush ("Straight Flush");
    private final String title;

    ValuesOfHands(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return STR."values{title='\{title}\{'\''}\{'}'}";
    }


}

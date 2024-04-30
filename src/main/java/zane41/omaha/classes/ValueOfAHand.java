package zane41.omaha.classes;


import static zane41.omaha.classes.ValuesOfHands.*;

public class ValueOfAHand implements Comparable<ValueOfAHand> {
    ValuesOfHands value;

    public ValueOfAHand() {
    }

    public void setValue(ValuesOfHands value) {
        this.value = value;
    }

    @Override
    public int compareTo(ValueOfAHand o) {
        if (this.value == StraightFlush && o.value!= StraightFlush) return 1;
        if (this.value != StraightFlush && o.value== StraightFlush) return -1;
        if (this.value == StraightFlush) return 0;

        if (this.value == Quad && o.value != Quad) return 1;
        if (this.value != Quad && o.value == Quad) return -1;
        if (this.value == Quad) return 0;

        if (this.value == FullHouse && o.value != FullHouse) return 1;
        if (this.value != FullHouse && o.value == FullHouse) return -1;
        if (this.value == FullHouse) return 0;

        if (this.value == Flush && o.value != Flush) return 1;
        if (this.value != Flush && o.value == Flush) return -1;
        if (this.value == Flush) return 0;

        if (this.value == Straight && o.value != Straight) return 1;
        if (this.value != Straight && o.value == Straight) return -1;
        if (this.value == Straight) return 0;

        if (this.value == Set && o.value != Set) return 1;
        if (this.value != Set && o.value == Set) return -1;
        if (this.value == Set) return 0;

        if (this.value == TwoPairs && o.value != TwoPairs) return 1;
        if (this.value != TwoPairs && o.value == TwoPairs) return -1;
        if (this.value == TwoPairs) return 0;

        if (this.value == Pair && o.value != Pair) return 1;
        if (this.value != Pair && o.value == Pair) return -1;
        if (this.value == Pair) return 0;

        else return 0;
    }

    @Override
    public String toString() {
        return "ValueOfAHand{" +
                "value=" + value +
                '}';
    }
}

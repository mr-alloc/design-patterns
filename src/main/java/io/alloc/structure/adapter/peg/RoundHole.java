package io.alloc.structure.adapter.peg;

public class RoundHole {

    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}

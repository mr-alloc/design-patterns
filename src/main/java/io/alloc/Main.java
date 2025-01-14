package io.alloc;

import io.alloc.structure.adapter.peg.RoundHole;
import io.alloc.structure.adapter.peg.SquarePeg;
import io.alloc.structure.adapter.peg.SquarePegAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);

        SquarePeg smallSquarePeg = new SquarePeg(5);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(smallSquarePeg);

        roundHole.fits(squarePegAdapter);
    }
}
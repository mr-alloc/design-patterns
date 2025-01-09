package io.alloc;

import io.alloc.structure.adapter.ex1.RoundHole;
import io.alloc.structure.adapter.ex1.RoundPeg;
import io.alloc.structure.adapter.ex1.SquarePeg;
import io.alloc.structure.adapter.ex1.SquarePegAdapter;

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
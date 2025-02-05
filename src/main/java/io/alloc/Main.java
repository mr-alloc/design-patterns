package io.alloc;

import io.alloc.behavior.visitor.filesystem.FileSystemUseCase;
import io.alloc.behavior.visitor.shape.ShapeUseCase;
import io.alloc.structure.adapter.peg.RoundHole;
import io.alloc.structure.adapter.peg.SquarePeg;
import io.alloc.structure.adapter.peg.SquarePegAdapter;
import io.alloc.structure.bridge.remote.RemoteUseCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShapeUseCase.run();
    }
}
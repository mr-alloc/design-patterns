package io.alloc;

import io.alloc.behavior.visitor.filesystem.FileSystemUseCase;
import io.alloc.behavior.visitor.shape.ShapeUseCase;
import io.alloc.structure.adapter.peg.RoundHole;
import io.alloc.structure.adapter.peg.SquarePeg;
import io.alloc.structure.adapter.peg.SquarePegAdapter;
import io.alloc.structure.bridge.remote.RemoteUseCase;
import io.alloc.structure.decorator.coffee.CoffeeUseCase;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 1);
        map.put("Bob", 2);
    }
}
package io.alloc.structure.decorator.coffee;

import io.alloc.structure.decorator.coffee.component.Americano;
import io.alloc.structure.decorator.coffee.component.Coffee;
import io.alloc.structure.decorator.coffee.component.Espresso;
import io.alloc.structure.decorator.coffee.decorator.ExtraShot;
import io.alloc.structure.decorator.coffee.decorator.Vanilla;
import io.alloc.structure.decorator.coffee.decorator.WhippedCream;

public class CoffeeUseCase {

    public static void run()  {

        Espresso espresso = new Espresso();

        // 아메리카노
        Coffee americano = new Americano(espresso);
        americano.print();

        // 샷이 추가된 아메리카노 주문
        Coffee doubleShot = new ExtraShot(americano);
        doubleShot.print();

        //트리플샷
        Coffee tripleShot = new ExtraShot(doubleShot);
        tripleShot.print();

        //바닐라 시럽, 휘핑크림이 추가된  아메리카노 주문
        Vanilla vanillaAdded = new Vanilla(americano);
        Coffee whippedVanillaAmericano = new WhippedCream(vanillaAdded);
        whippedVanillaAmericano.print();
    }
}

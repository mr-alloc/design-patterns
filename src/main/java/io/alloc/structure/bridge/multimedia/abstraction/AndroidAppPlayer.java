package io.alloc.structure.bridge.multimedia.abstraction;

import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public abstract class AndroidAppPlayer extends MediaPlayer {

    public AndroidAppPlayer(PlayerImplementor implementor) {
        super(implementor);
    }

    protected void emulateVirtualMachine() {
        System.out.println("Emulating Android Virtual Machine");
    }
}

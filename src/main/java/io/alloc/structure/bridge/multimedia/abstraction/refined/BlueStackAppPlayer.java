package io.alloc.structure.bridge.multimedia.abstraction.refined;

import io.alloc.structure.bridge.multimedia.abstraction.AndroidAppPlayer;
import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public class BlueStackAppPlayer extends AndroidAppPlayer {

    public BlueStackAppPlayer(PlayerImplementor implementor) {
        super(implementor);
    }

    @Override
    public void play(String filename) {
        super.emulateVirtualMachine();
        System.out.println("App Player:");
        implementor.playFile(filename);
    }

    @Override
    public void stop() {
        System.out.println("App Player:");
        implementor.stopPlayback();
    }
}

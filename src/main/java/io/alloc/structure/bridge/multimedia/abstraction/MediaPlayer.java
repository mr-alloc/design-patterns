package io.alloc.structure.bridge.multimedia.abstraction;

import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public abstract class MediaPlayer {

    protected PlayerImplementor implementor;

    public MediaPlayer(PlayerImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void play(String filename);
    public abstract void stop();
}

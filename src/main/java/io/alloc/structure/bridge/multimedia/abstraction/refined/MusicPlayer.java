package io.alloc.structure.bridge.multimedia.abstraction.refined;

import io.alloc.structure.bridge.multimedia.abstraction.MediaPlayer;
import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public class MusicPlayer extends MediaPlayer {

    public MusicPlayer(PlayerImplementor implementor) {
        super(implementor);
    }

    @Override
    public void play(String filename) {
        System.out.println("Music Player:");
        implementor.playFile(filename);
    }

    @Override
    public void stop() {
        System.out.println("Music Player:");
        implementor.stopPlayback();
    }
}

package io.alloc.structure.bridge.multimedia.abstraction.refined;

import io.alloc.structure.bridge.multimedia.abstraction.MediaPlayer;
import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public class VideoPlayer extends MediaPlayer {

    public VideoPlayer(PlayerImplementor implementor) {
        super(implementor);
    }

    @Override
    public void play(String filename) {
        System.out.println("Video Player:");
        implementor.playFile(filename);
    }

    @Override
    public void stop() {
        System.out.println("Video Player:");
        implementor.stopPlayback();
    }
}

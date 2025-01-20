package io.alloc.structure.bridge.multimedia.implementor.concrete;

import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public class MacPlayer implements PlayerImplementor {
    @Override
    public void playFile(String filename) {
        loadCodec("Apple QuickTime");
        System.out.println("Playing "+ filename + " using QuickTime Player");
    }

    @Override
    public void stopPlayback() {
        System.out.println("Stopping playback on MacOS");
    }

    @Override
    public void loadCodec(String codec) {
        System.out.println("Loading " + codec + " codec on MacOS");
    }
}

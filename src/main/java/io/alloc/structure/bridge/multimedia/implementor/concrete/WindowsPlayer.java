package io.alloc.structure.bridge.multimedia.implementor.concrete;

import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;

public class WindowsPlayer implements PlayerImplementor {

    @Override
    public void playFile(String filename) {
        loadCodec("Windows DirectShow");
        System.out.println("Playing " + filename + " using Windows media player");
    }

    @Override
    public void stopPlayback() {
        System.out.println("Stopping playback on Windows");
    }

    @Override
    public void loadCodec(String codec) {
        System.out.println("Loading " + codec + " codec on Windows");
    }

}

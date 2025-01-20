package io.alloc.structure.bridge.multimedia.implementor;

public interface PlayerImplementor {

    void playFile(String filename);

    void stopPlayback();

    void loadCodec(String codec);
}

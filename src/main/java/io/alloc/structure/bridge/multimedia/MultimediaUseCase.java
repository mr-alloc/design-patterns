package io.alloc.structure.bridge.multimedia;

import io.alloc.structure.bridge.multimedia.abstraction.MediaPlayer;
import io.alloc.structure.bridge.multimedia.abstraction.refined.MusicPlayer;
import io.alloc.structure.bridge.multimedia.abstraction.refined.VideoPlayer;
import io.alloc.structure.bridge.multimedia.implementor.PlayerImplementor;
import io.alloc.structure.bridge.multimedia.implementor.concrete.MacPlayer;
import io.alloc.structure.bridge.multimedia.implementor.concrete.WindowsPlayer;

public class MultimediaUseCase {

    public static void run() {
        PlayerImplementor windowsPlayer = new WindowsPlayer();
        PlayerImplementor macPlayer = new MacPlayer();

        MediaPlayer videoOnWindows = new VideoPlayer(windowsPlayer);
        MediaPlayer musicOnMac = new MusicPlayer(macPlayer);

        videoOnWindows.play("video.mp4");
        videoOnWindows.stop();

        System.out.println();

        musicOnMac.play("music.mp3");
        musicOnMac.stop();
    }
}

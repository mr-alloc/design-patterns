package io.alloc.structure.bridge.remote;

import io.alloc.structure.bridge.remote.implement.AdvanceRemoteControl;
import io.alloc.structure.bridge.remote.implement.Radio;
import io.alloc.structure.bridge.remote.implement.Television;

public class RemoteUseCase {

    public static void run() {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl(television);

        remoteControl.togglePower();

        Radio radio = new Radio();
        AdvanceRemoteControl radioRemote = new AdvanceRemoteControl(radio);
        radioRemote.mute();
    }
}

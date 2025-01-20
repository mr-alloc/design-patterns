package io.alloc.structure.bridge.remote.implement;

import io.alloc.structure.bridge.remote.Device;
import io.alloc.structure.bridge.remote.RemoteControl;

public class AdvanceRemoteControl extends RemoteControl {

    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        if (device.isEnabled()) {
            device.setVolume(0);
            return;
        }

        System.out.println("Device is off. Please turn on the device first.");
    }
}

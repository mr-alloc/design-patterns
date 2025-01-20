package io.alloc.structure.bridge.remote;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    protected void togglePower() {
        if (device.isEnabled()) {
            device.disable();
            return;
        }

        device.enable();
    }

    protected void volumeDown() {
        if (device.isEnabled()) {
            device.setVolume(device.getVolume() - 10);
            return;
        }

        System.out.println("Device is off. Please turn on the device first.");
    }

    protected void volumeUp() {
        if (device.isEnabled()) {
            device.setVolume(device.getVolume() + 10);
            return;
        }

        System.out.println("Device is off. Please turn on the device first.");
    }

    protected void channelDown() {
        if (device.isEnabled()) {
            device.setChannel(device.getChannel() -1);
            return;
        }
        System.out.println("Device is off. Please turn on the device first.");
    }

    protected void channelUp() {
        if (device.isEnabled()) {
            device.setChannel(device.getChannel() +1);
            return;
        }
        System.out.println("Device is off. Please turn on the device first.");
    }



}



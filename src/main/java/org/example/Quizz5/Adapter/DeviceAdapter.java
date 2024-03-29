package org.example.Quizz5.Adapter;

public class DeviceAdapter implements NewDevice{


    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        System.out.println("Adapting to old version");
        oldDevice.operateOldFunction();
    }
}

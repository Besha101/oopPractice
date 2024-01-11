package org.example.Quizz5.Adapter;

public class Main {

    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();

        NewDevice newDevice = new DeviceAdapter(oldDevice);
        newDevice.operateNewFunction();
    }


}

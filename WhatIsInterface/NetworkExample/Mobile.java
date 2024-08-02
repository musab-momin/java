package WhatIsInterface.NetworkExample;

public class Mobile implements Connectable {

    public void Connect() {
        System.out.println("Mobile is connected. >>>");
    }

    public void Disconnect() {
        System.out.println("Mobile is disconnected. >>>");
    }
}

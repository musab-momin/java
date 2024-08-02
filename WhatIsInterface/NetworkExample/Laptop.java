package WhatIsInterface.NetworkExample;

public class Laptop implements Connectable {

    public void Connect() {
        System.out.println("Laptop is connected: >>>");
    }

    public void Disconnect() {
        System.out.println("Laptop has been disconnected: >>>");
    }
}

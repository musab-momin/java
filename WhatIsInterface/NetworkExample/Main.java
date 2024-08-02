package WhatIsInterface.NetworkExample;

import WhatIsInterface.NetworkExample.*;;

public class Main {
    public static void main(String[] args) {
        Connectable laptop = new Laptop();
        Connectable mobile = new Mobile();

        laptop.Connect();
        mobile.Connect();

        laptop.Disconnect();
        mobile.Disconnect();
    }
}

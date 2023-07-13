package OOP;

public class Interface {
    static public void main(String[] args) {

        Computer mac = new Computer("iMac27");

        iPhone iPhoneX = new iPhone("myiPhoneX");
        iPhone iPhone8 = new iPhone("myiPhone8");
        mac.usb1 = iPhoneX;
        mac.usb2 = iPhone8;
        mac.powerSupply();

    }
}

interface USBInterface {

}
interface USBPowerSupply extends USBInterface{
    public void powerSupply();
}
interface USBReceive extends USBInterface {
    public void powerReceive();
}

class Computer implements USBPowerSupply {
    String name;
    public USBReceive usb1;
    public USBReceive usb2;

    Computer(String name) {
        this.name = name;
    }
    public void powerSupply() {
        System.out.println(this.name + " provide power to any devices connected with USB ports. ");
        usb1.powerReceive();
        usb2.powerReceive();
    }

}

class iPhone implements USBReceive {
    String name;
    iPhone(String name) {
        this.name = name;
    }
    public void powerReceive() {
        System.out.println(this.name + " charging port receiving power from cord. ");
    }
}
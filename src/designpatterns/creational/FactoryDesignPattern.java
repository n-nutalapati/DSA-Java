package designpatterns.creational;

/*
*
* Factory Design Pattern
* It is a creational design pattern that provides an interface for creating objects in a superclass,
* but allows subclasses to alter the type of objects that will be created.
* */

interface OperatingSystem {
    void boot();
    String getName();
}

class WindowsOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting Windows OS");
    }

    @Override
    public String getName() {
        return "Windows";
    }
}

class LinuxOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting Linux OS");
    }

    @Override
    public String getName() {
        return "Linux";
    }
}

class MacOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting Mac OS");
    }

    @Override
    public String getName() {
        return "Mac";
    }
}

class OperationingSystemFactory {
    public static OperatingSystem create(String type) {
        if(type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        switch (type.toLowerCase()) {
            case "windows":
                return new WindowsOS();
            case "linux":
                return new LinuxOS();
            case "mac":
                return new MacOS();
            default:
                throw new IllegalArgumentException("Unknown operating system type");
        }
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        OperatingSystem os1 = OperationingSystemFactory.create("windows");
        os1.boot();
        System.out.println("Operating System: " + os1.getName());

        OperatingSystem os2 = OperationingSystemFactory.create("linux");
        os2.boot();
        System.out.println("Operating System: " + os2.getName());

        OperatingSystem os3 = OperationingSystemFactory.create("mac");
        os3.boot();
        System.out.println("Operating System: " + os3.getName());
    }

}

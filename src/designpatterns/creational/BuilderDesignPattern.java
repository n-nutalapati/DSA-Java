package designpatterns.creational;


/*
    * creational design pattern
    * Used to construct a complex object step by step.
    * It allows you to create different types and representations of an object using the same construction process.
 */

// implementation of builder design pattern
class Computer {
    // required parameters
    private final String HDD;
    private final String RAM;
    // optional parameters
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // Builder Class
    public static class ComputerBuilder {
        // required parameters
        private String HDD;
        private String RAM;
        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderDesignPattern {

    public static void main(String[] args) {
        // creating instance of builder design pattern
        Computer computer = new Computer.ComputerBuilder("500 GB", "8 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        // printing the computer details
        System.out.println("HDD: " + computer.getHDD());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Is Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
        System.out.println("Is Bluetooth Enabled: " + computer.isBluetoothEnabled());
    }
}

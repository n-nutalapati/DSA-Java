package designpatterns.creational;

/*
    * Abstract Factory Design Pattern
    * It is a creational design pattern that provides an interface for creating families of related or
    * dependent objects without specifying their concrete classes.
 */

interface Button {
    void render();
}

interface Checkbox {
    void render();
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class  LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Linux Button");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}

class LinuxCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Linux Checkbox");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}

public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();

        factory = new LinuxFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();
    }
}

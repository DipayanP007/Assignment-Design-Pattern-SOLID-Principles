package SOLID.DependancyInversion;

class Bulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Bulb turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb turned Off");
    }
}
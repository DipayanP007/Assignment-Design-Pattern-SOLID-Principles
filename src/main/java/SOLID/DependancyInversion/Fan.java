package SOLID.DependancyInversion;


public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned Off");
    }
}

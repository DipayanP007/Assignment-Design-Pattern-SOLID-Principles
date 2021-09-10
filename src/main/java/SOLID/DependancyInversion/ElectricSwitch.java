package SOLID.DependancyInversion;

public class ElectricSwitch implements Switch {

    Switchable switchable;
    boolean on;

    public ElectricSwitch(Switchable client) {
        switchable = client;
        this.on = false;

    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {

        if (isOn()) {
            switchable.turnOff();
            this.on = false;
        } else {
            switchable.turnOn();
            this.on = true;
        }
    }
}

package SOLID.DependancyInversion;

public class Appliance {
    public static void main(String[] args) {


        Switchable bulb = new Bulb();
        Switch electricSwitchBulb = new ElectricSwitch(bulb);
        electricSwitchBulb.press();
        electricSwitchBulb.press();

        Switchable fan= new Fan();
        Switch electricSwitchFan= new ElectricSwitch(fan);
        electricSwitchFan.press();
        electricSwitchFan.press();
    }
}
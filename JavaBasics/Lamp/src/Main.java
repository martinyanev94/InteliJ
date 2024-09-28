public class Main {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp("Halogen", "Living room");

        led.turnOn();
        halogen.turnOff();
        System.out.println(halogen.isOn);
    }
}
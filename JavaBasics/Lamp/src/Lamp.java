public class Lamp {
    boolean isOn;
    String nameLocal;
    String location;

    public Lamp(String name, String local) {
        nameLocal = name;
        location = local;
    }

    public Lamp(){
        nameLocal = "Default name";
        location = "Default location";
    }

    void turnOn() {
        isOn = true;
        if (isOn) {
            System.out.println(nameLocal + " lamp is on");
        }
    }

    void turnOff() {
        isOn = false;
        if (!isOn) {
            System.out.println(nameLocal + " lamp is off");
        }
        }

    }


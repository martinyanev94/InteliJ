public class MainSurround {
    public static void main(String[] args) {
        Toy objToy = null;

        try {
            objToy = CreateToy.getToy();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (objToy == null) {

        }

    }
}

class CreateToy{
    private static Toy toy;
    private CreateToy() {
        toy = new Toy();
    }

    public   () {

    }

    public static Toy getToy() throws Exception {
        return toy;
    }
}

class Toy {

}

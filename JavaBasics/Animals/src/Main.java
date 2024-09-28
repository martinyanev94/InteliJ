public class Main {
    public static void main(String[] args) {

        Cat mew= new Cat();
        mew.name = "Mew";
        Dog rex = new Dog();
        rex.name = "Rex";

        mew.display();
        rex.display();
        mew.eat();
        rex.eat();
        mew.purr();
        rex.barking();


    }
}
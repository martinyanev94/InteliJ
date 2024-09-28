public class Main {
    public static void main(String[] args) {

        Worker john = new Worker(100000, "John Smith");

        john.setName("Jack");
        john.setSalary(130000);

        System.out.println(john.getSalary());
        System.out.println(john.getName());



    }
}
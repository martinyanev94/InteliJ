public class Worker {
    int salary;
    String name;

    // Constructor

    public Worker(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }


    //Get and Set methods

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

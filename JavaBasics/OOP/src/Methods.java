public class Methods {
    static int myMethod(String fname, int age) {
        System.out.println(fname + " Smith");
        System.out.println(fname + "'s age is " + age);
        int curYear = 2025;
        int birthYear = curYear - age;
        return birthYear;

    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum = plusMethod(8, 5);
        double myNum2 = plusMethod(4.6, 3.1);


//        int jimmyBirth = myMethod("Jimmy", 26);
//        int robBirth = myMethod("Rob", 54);
//        System.out.println(jimmyBirth);
//        System.out.println(robBirth);
//        int age = 5;
    }
}

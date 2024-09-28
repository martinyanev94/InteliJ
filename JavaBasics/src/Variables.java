public class Variables {
    public static void main(String[] args) {
     /* String - stores text, such as "Hello". String values are surrounded by double
         quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded
        by single quotes
        boolean - stores values with two states: true or false
      */

        // String
        String name = "John";
        String lastName = "Doe";
        String fullName = name + lastName;
        System.out.println(fullName);

        // Integer
        int myNumber;
        myNumber = 20;
        System.out.println(myNumber);

        // Final Integer
        final int myInt = 15;
//        myInt = 20;

        char myLetter = 'D';
        boolean myBool = true;
        float myFloat = 6.99f;

//        int x = 1, y = 2, z = 3;
        int x, y, z;
        x=y=z=50;
        System.out.println(x+y+z);





    }
}

public class HelloWorld{
    // Entry point (psvm + tab)
    public static void main(String[] args) {
//        This is what prints out to the console (sout + tab)
        System.out.println("Hello, World!");
        System.out.println("Hope you are well, I am excited to learn together!");

//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
            int myFavoriteNumber = 42;
            System.out.println(myFavoriteNumber);
//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
            String myString = "Good morning Neverland";
            System.out.println(myString);
//        Change your code to assign a character value to myString. What do you notice?
//         char newVal = myString;
//            String.out.println(newVal);
//            Wont assign
//        Change your code to assign the value 3.14159 to myString. What happens?
//        double pi = 3.14159;
//        pi = myString;
//        Suggests I change value of myString to double
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
            long myNumber;
//            System.out.println(myNumber);
//            Intellij is telling me I haven't initialized myNumber
//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//            myNumber = 3.14;
//            Intellij tells me a "long" type is required but I am trying to provide a double.  Will not work
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
//        System.out.println(myNumber);
//        I was able to print the line sans 'L';
//        Change your code to assign the value 123 to myNumber.
        myNumber = 123;
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        This is because the type of long is a wide scoped integer type...3.14 is a double-precision, floating-point numbers type
//                Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//            float = myNumber;
//            This is not a statement
//        float smallPi = 3.14;
//        long myNumber = smallPi;

        double smallPi = 3.14;
        float newPi = (float) smallPi;
        System.out.println(newPi);

        myNumber = (long) newPi;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        class first{
//            public static void main(String[] args) {
////                Inner cannot have static declarations
//            }
//        }

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(o);
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')

//        int three = (int) "three";
//        Inconvertible types - cannot cast string to int

        int y = 4;
//        y = y + 5;

System.out.println(y += 5);

        int a = 3;
        int b = 4;
//        b = b * a;
        System.out.println(b *= a);

        int t = 10;
        int u = 2;
//        t = t / u;
        System.out.println(t /= u);
//        y = y - x;
        System.out.println(u -= t);


    }
}
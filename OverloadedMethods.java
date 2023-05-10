package HWclass19;

/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.

 */
public class OverloadedMethods {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, double b) {
        System.out.println(a + b);
    }

    static void add(int a, double b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        add(9, 12);
        add(7, 12);
        add(6, 5.3, 7);


    }


}

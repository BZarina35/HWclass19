package HWclass19;

/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class Overloaded2 {

    private void multiply(int num1, int num2, double num3){
        System.out.println(num1*(num2+num3));
    }

    private void multiply(double num1, int num2){
        System.out.println(num1*num2);
    }

    private void multiply(int num1, int num2, int num3){
        System.out.println((num1+num2)*num3);
    }

    public static void main(String[] args) {
        Overloaded2 obj=new Overloaded2();
       obj.multiply(3,5,5.2);
       obj.multiply(5.5,7);
       obj.multiply(3, 5,7);
    }

}

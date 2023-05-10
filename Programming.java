package HWclass19;

/*
Create a class named 'Programming'. While creating an object of the class,
if nothing is passed to it, then the message "I love programming languages"
should be printed. If some String is passed to it, then in place of "programming languages"
the value variable should be printed. Example, if we pass "Java", then "I love Java" should be
printed.

 */
public class Programming {

    private String language;

    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String language) {
        this.language = language;
        System.out.println("I love " + language);
    }


    public static void main(String[] args) {
        Programming p1 = new Programming();
        Programming p2 = new Programming("Java");

    }
}
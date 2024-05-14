package part4.introToOOP;

public class Person {

    // Private keyword means that the variables are hidden inside the object, "Encapsulation"
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}

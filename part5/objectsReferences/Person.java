package part5.objectsReferences;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHi() {
        return "Hello there!";
    }

    public String toString() {
        return "My name is " + this.name;
    }
}
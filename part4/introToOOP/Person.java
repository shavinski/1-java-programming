package part4.introToOOP;

public class Person {

    // Private keyword means that the variables are hidden inside the object,
    // "Encapsulation"
    private int age;
    private int weight;
    private int height;
    private String name;

    public Person(String initialName) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }
}

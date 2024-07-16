package part5.objectsReferences;

public class NullPointerException {
    public static void main(String[] args) {
        Person jakob = new Person("Jakob");
        System.out.println(jakob.sayHi());

        jakob = null;

        System.out.println(jakob.sayHi());
    }
}
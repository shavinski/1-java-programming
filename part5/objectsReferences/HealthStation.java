package part5.objectsReferences;

public class HealthStation {

    private int weighings;

    public HealthStation() {
        this.weighings = 0;
    }

    public static void main(String[] args) {
        // example main program for the first section of the exercise

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }

    public int weigh(Person person) {
        int weight = person.getWeight();

        int currentWeighings = getWeighings();
        int newWeighings = currentWeighings + 1;
        this.setWeighings(newWeighings);

        return weight;
    }

    public void feed(Person person) {
        int addOneCurrentWeight = person.getWeight() + 1;
        person.setWeight(addOneCurrentWeight);
    }

    public int getWeighings() {
        return weighings;
    }

    public void setWeighings(int weighings) {
        this.weighings = weighings;
    }

    public int weighings() {
        int currentWeighings = getWeighings();

        return currentWeighings;
    }
}

package part5.reptitiveCode;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

     public int value() {
        return this.value;
     }

     public void increase() {
        this.value++;
     }

     public void increase(int increaseBy) {
        this.value += increaseBy;
     } 

     public void decrease() {
        this.value--;
     }

     public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
     }
}

package abstraction;

public class TestFinalVar {
    final int SPEED_LIMIT = 80;
    //instance method
    void display(){
        System.out.println("Speed limit is = " + SPEED_LIMIT);
//        SPEED_LIMIT= 100;
        // Error ! Cannot change final variable
    }

    public static void main(String[] args) {
        TestFinalVar obj = new TestFinalVar();
        obj.display();
        // we can not directly use instance method in static context
//        this.display();
    }
}

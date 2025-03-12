package oopsconcept;

public class Test {
    void display(Test t){
        System.out.println("Method called");
    }

    void show(){
        //passing this as a argument
        display(this);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}

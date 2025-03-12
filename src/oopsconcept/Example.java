package oopsconcept;

public class Example {
    void display(){
        System.out.println("Current object return");
    }

    Example getObj(){
//        returning current class obj
        return this;
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.getObj().display();
    }
}

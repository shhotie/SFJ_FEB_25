package interfaceExamples;

public interface Bird {
    void fly();
    void sound();
    default void sleep(){
        System.out.println("Bird is sleeping");
    }
}

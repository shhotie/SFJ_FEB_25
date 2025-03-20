package interfaceExamples;

public interface Animal{
    void eat();
    void sound();
    default void sleep(){
        System.out.println("Animal is sleeping");
    }
}

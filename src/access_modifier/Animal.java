package access_modifier;

public class Animal {
    // public variables
    public  String type;

    // public method
    public void eat(){
        System.out.println("Animal is eating");
    }

    public String drinking(){
        return "Cat is drinking milk";
    }

    public void animalType(){
        System.out.println("Animal is = " + type);
    }
}

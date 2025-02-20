package access_modifier;

import java.sql.SQLOutput;

public class Tester {
    public static void main(String [] args){
        // syntax to create new object
        // ClassName variable = new ClassName();
        Person person1 = new Person();
        person1.setHeight(162);

        Vehicle v = new Vehicle();
        v.displayBrand();

        Animal cat = new Animal();
        cat.type = "Domestic";
        cat.eat();
        cat.animalType();

        String result = cat.drinking();
        System.out.println(result);

        System.out.println(cat.drinking());

    }
}

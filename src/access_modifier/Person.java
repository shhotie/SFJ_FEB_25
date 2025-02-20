package access_modifier;

public class Person {
    // private variable
    // field // data member
    private int height;

    // private method
    private void displayHeight(){
    System.out.println("Height of person = " + height);
    }

    // public method to access private members
    public void setHeight(int height){ // parameter
        this.height = height;
        displayHeight();
    }

}

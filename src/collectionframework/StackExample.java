package collectionframework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Adding elements = Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        Stack<String> languages = new Stack<>();
        languages.push("Java");
        languages.push("Apex");
        languages.push("Python");
        languages.push("C++");
        System.out.println(languages);

        System.out.println(languages.peek());

        System.out.println(languages.pop());
        System.out.println(languages);
        System.out.println(languages.pop());
        System.out.println(languages.pop());
        System.out.println(languages.pop());

        // Check if Stack is empty
        System.out.println(languages.isEmpty());

        System.out.println(languages.pop());

        Stack<Integer> stack1 = new Stack<>();
        // Adding elements = Push
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);


    }
}

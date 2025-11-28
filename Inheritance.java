class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {  // Dog inherits from Animal
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Inherited method
        dog.eat();

        // Dog's own method
        dog.bark();
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // From Dog
    }
}

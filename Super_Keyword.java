class Parent {
    void display() {
        System.out.println("Display from Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display();  // calls Parent method
        System.out.println("Display from Child class");
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

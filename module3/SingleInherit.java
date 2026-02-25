class Animal {
    public void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Barking");
    }
}
public class SingleInherit{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
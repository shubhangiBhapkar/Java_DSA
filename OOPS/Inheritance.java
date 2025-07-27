public class Inheritance {
    public static void main(String[] args){
        Dog doggy =new Dog();
        doggy.eat();
        doggy.legs=4;
        System.out.println(doggy.legs);
    }
}

class Animal {
    String color;
    void eat(){
        System.out.println("eating..");
    }
    void breadth(){
        System.out.println("bredthing..");
    }
}

class Mammal extends Animal{
    int legs;

}
class Dog extends Mammal{
    String breed;
}
public class abstractEx {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        //Will print brown cause it calls parent constructor first 
        //and color will not be changed until we calls changeColor on Horse
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);
    }
    
 }
 
abstract class Animal {
    String color;

    Animal() {
        color = "brown";
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    void changeColor(){
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}

class Animal2{
    void eat()
    {
        System.out.println("eating...");
    }
}
class dog2 extends Animal2 {

    void eat() {
        System.out.println("eating bread");
        super.eat();
    }

    void bark() {
        System.out.println(" barking");
    }

    void work() {
        super.eat(); //invoke the parent class methods using super keyword.
        bark();
    }
}
public class supermetods {
    public static void main(String[] args) {
        dog2 obj=new dog2();
        obj.work();
        obj.eat();

    }
}

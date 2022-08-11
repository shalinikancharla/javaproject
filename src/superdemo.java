class Animal
{
    String str="white";
}
class dog extends Animal
{
    String str="black";      //super keyword refers to the immediate parent class instance variable
    void printcolor()
    {
        System.out.println(str);//black
       System.out.println(super.str);//white

    }
}
public class superdemo {
    public static void main(String[] args) {
        dog obj=new dog();
        obj.printcolor();
    }
}

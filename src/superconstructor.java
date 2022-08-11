class Animal1
{
    Animal1()
    {
        System.out.println("Animal is created");
    }
}
class dog1 extends Animal1
{
    dog1()
    {

        System.out.println("dog is created");

    }
}
class babydog extends dog1{
    babydog()
    {
        super();
        System.out.println("babydog is created");
    }
}
public class superconstructor {
    public static void main(String[] args) {
        babydog obj=new babydog();
    }
}

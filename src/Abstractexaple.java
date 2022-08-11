public abstract class Abstractexaple {
    Abstractexaple() {
        System.out.println("constructor invoked");
    }

    abstract void start();

    abstract void run();
}
class bike extends Abstractexaple
{
    void start()
    {
        System.out.println("starts with excletor");
    }
    void run()
    {
        System.out.println("running with petrol");
    }
    public static void main(String[] args) {
        Abstractexaple obj=new bike();
       /* obj.run();
        obj.start();
        obj=new car();
        obj.run();
        obj.start();*/

    }
}
class car extends Abstractexaple
{
    void start()
    {
        System.out.println("starts with clutch");
    }
    void run()
    {
        System.out.println("running with petrol and diesel");
    }


}

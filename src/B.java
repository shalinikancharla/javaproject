public interface B {
    void start();
    void run();
}
class c implements A,B{
     public void start()
    {

        System.out.println("A&B starting");
    }
    public void run()
    {
        System.out.println("A&B running");
    }

    public static void main(String[] args) {
       c ob=new c();
       ob. start();
       ob. run();

    }



}

 class casting
{
    void display()
    {
        System.out.println("casting class1");
    }
}
public class typecastingclasses extends casting {
    void display() {
        System.out.println("casting class");

    }

    public static void main(String[] args) {


        //typecastingclasses tc = new typecastingclasses();
        //casting c = (casting) tc;
        //tc.display();
        casting c=new typecastingclasses();
        c.display();
        casting c1=new casting();
        c1.display();

    }

}

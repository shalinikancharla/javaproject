 interface interface1 {
    int a=10;
    void show();
}
interface interface2
{
    String str="shalini";
    void display();
    void show();
}
class class1 implements interface1,interface2
{
    public void show()
    {
        System.out.println(a);

    }
    public void display()
    {
        System.out.println(str);
    }

    public static void main(String[] args) {
        class1 ob=new class1();
        ob.show();
        ob.display();
        interface2 ob2=new class1();
        ob2.show();


    }
}

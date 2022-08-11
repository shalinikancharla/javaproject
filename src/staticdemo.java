public class staticdemo {
    private int b=10;//local variable
    void privatedisplay()
    {
        System.out.println(b);
    }
    static int a=20;//static variable
    static void display()//static method
    {
        System.out.println("without object creation"+a);
    }

    public static void main(String[] args) {
        staticdemo ob=new staticdemo();
        ob.privatedisplay();
       staticdemo. a=40;
        System.out.println(a);//static
        display();//static method
    }
}

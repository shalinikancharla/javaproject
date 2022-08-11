
public class constructordemo
{
    char c;
    String str;
    private double d;
    constructordemo(int i,double d)
    {

        c='d';
        System.out.println(i + d);
        System.out.println(c);


    }
    void display()
    {
        this.c='f';
        String str="welcome";
        System.out.println(str+c);
    }
    void display(int i)
    {
        this.c='f';
        i=25;
        String str="welcome";
        System.out.println(i);
        System.out.println(str+c);
    }
    constructordemo()
    {
        super();
        System.out.println(c);

    }


    public static void main(String[] args) {
        constructordemo ob=new constructordemo(12,12.5);
        ob.d=90;
        System.out.println((ob.d));
        System.out.println(ob.c);
        ob.display();
        ob.display(23);
        constructordemo ob1=new constructordemo();
        ob1.c=56;

    }
}

public class thisdemo {
    int a;
    char c;
    int b;
    thisdemo()
    {
        display1(12,'y');//in that constructor we can call the methods.
        System.out.println(a +c);
    }
    void display()
    {

        System.out.println(c);;
        System.out.println(a);

    }
    void display1(int a,char c)
    {
       // a=90;
        //c='z';
        //this.a=a;
        //this.c=c;
        System.out.println(a);
        System.out.println(c);
    }

    public static void main(String[] args) {
        thisdemo ob=new thisdemo();
        ob.a=34;
        ob.c='t';
        ob.display();
        ob.display1(45,'q');
    }
}

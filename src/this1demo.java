public class this1demo {
    int a;
    double d;
    this1demo(int a,double d)
    {
        this.a=a;
        this.d=d;
          display();
    }
    void display()
    {

        System.out.println("display"+a);
        System.out.println("this display"+d);
    }
    void display1(double d)
    {
        System.out.println(d);
    }

    public static void main(String[] args) {
        this1demo ob=new this1demo(12,12.5);
        ob.display();
        //ob.display1(10.5);

    }
}

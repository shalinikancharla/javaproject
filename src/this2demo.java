public class this2demo {
    int a;
   /* this2demo(int a)
    {
        this.a=a;
        display();
    }*/
    void display(int a)
    {
        this.a=a;//if we didn't use this operator then they take defult values
        System.out.println("display"+a);
        display1();
    }
    void display1()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        this2demo ob=new this2demo();
        ob.display(12);
    }
}

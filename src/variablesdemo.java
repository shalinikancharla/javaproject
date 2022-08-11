public class variablesdemo {
    static int s;//static variable
    public void display()
    {
        int l;//local variable
        System.out.println(l=10);
    }

    public static void main(String[] args) {
        int i;//intance variable
        System.out.println(i=90);
        System.out.println("static variable:"+s);
        variablesdemo ob1=new variablesdemo();
        ob1.display();



    }



}

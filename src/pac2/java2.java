package pac2;

import pac1.java1;

public class java2  {
    int a;
   public void show()
    {
        System.out.println("public  show modifier");
        System.out.println(a=12);

    }

    public static void main(String[] args) {
        java2 ob=new java2();
        ob.show();
        java1 ob1=new java1();
        ob1.class1display();
    }
}

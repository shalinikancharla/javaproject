public class Myclass {
    int  a;
    double d;
    char c;
    String str ;  // data members

    Myclass(int a, double d, char c, String str)
    {
        //this.a = a;
        //this.d = d;
        //this.c=  c;
        //this.str = str;
        //System.out.println(a);
        display(45);
    }

    void display(int a)
    {
         a=32;
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Myclass ob = new Myclass(11, 22.22, 'g', "text value");

         ob.display(12);

    }

    }

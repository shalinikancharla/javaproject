public class triangle {
    public static void main(String[] args) {
        int a = 90;
        int b = 30;
        int c = 60;
        if(a+b+c==180 && a>0 && b>0 && c>0) {
            if (a == b && b == c && c==a)
                System.out.println("Equilateral triangle");
            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("Isosceles triangle");
            if (a != b && b != c && c != a)
                System.out.println("Scalene triangle");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled triangle");
        }
        else
            System.out.println("this is not a triangle ");
    }
}

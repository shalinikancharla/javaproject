public class fibonaciseries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        int n = 7;//print first 7 natural numbers   // 0 1   1    2    3 5
        //System.out.println(a + b);                //   a b a+b
        for(int i=0;i<=n;i++)                               //sum
        {
            sum=a+b;
            System.out.print(sum);
            a=b;
            b=sum;
        }
    }

}

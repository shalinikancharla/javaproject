public class armstrong {

    public static void main(String[] args) {
        int r,sum=0;
        int n=153; //370,371,407
        int temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("given number is amstrong number");
        }
        else {
            System.out.println("given number is not amstrong");
        }

    }
}

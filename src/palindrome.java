public class palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=434;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("given number is palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }

        //on strings
        String str="AHA";
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {

            str1=str1+str.charAt(i);
        }
        System.out.println(str1);

        if(str1.equals(str))
        {
            System.out.println("given number is palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }



    }
}

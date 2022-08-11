public class datatypedemo {
    public static void main(String[] args) {

        boolean b = true;

        char ch1 = 'c'; // small letter
        char ch2 = 'A';// capital letter
        char ch3 = '3'; // number
        char ch4 = '#'; // special character
        char ch5 = '@';

        char c = 33;

        System.out.println(ch5);
        byte b1 = -32;
        int a=12;
        byte sum=(byte)(a+b1);//type casting
        int sum1=a+b1;
        System.out.println("with type casting:"+sum);//-20
        System.out.println("without type casting:"+sum1);

    }

}


public class reversedemo {
    public static void main(String[] args) {
        String str="shalini";
        String reverse="";
        char ch;
        /*for(int i=0;i<str.length();i++) {  for(int i=str.length();i>=0;i--)
            ch = str.charAt(i);                         System.out.print(str.charAt(i));

            reverse = ch + reverse;
        }*/
        for(int i=str.length()-1;i>=0;i--)
            System.out.print(str.charAt(i));
            System.out.println(reverse);
        StringBuilder str1= new StringBuilder();
        str1.append("shalini");
        System.out.println(str1.reverse());




    }

}

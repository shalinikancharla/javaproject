public class stringdemo {
    public static void main(String[] args) {


        String str = "we want go to tornoto";
        System.out.println(str.charAt(3));
        String[] st = str.split(" ");
        for (int i=0;i<st.length;i++)
        {
            if(st[i].endsWith("o"))
            System.out.println(st[i]);
        }

        //int l = st.length;
        //System.out.println(l);
        /*for (int j=0;j<st.length;j++) {

            if(st[j].endsWith("o"))

            System.out.println(st[j]);

       }*/
        //string classesvs string and stringbuffer
        String str1="java";
        str1.concat("rules");
        System.out.println(str1);//string immutable

        StringBuffer str2=new StringBuffer("java");
        str2.append("rules");
        System.out.println(str2);//stringbuffer mutable

        StringBuilder str3=new StringBuilder("java");
        StringBuilder str4=new StringBuilder("rules");
        StringBuilder s=str3.append(str4);
        System.out.println(s);//stringBuilder mutable






    }

}

package collection;

import java.util.ArrayList;

public class adddemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shalini");
        al.add("honey");
        al.add("venki");
        al.add("piya");
        al.add("prasad");
        //add method
        System.out.println(al);
        //addall method
        ArrayList<String> al1=new ArrayList<>();
        al1.addAll(al);
        System.out.println(al1);



    }
}

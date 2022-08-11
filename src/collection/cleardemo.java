package collection;

import java.util.ArrayList;

public class cleardemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shalini");
        al.add("honey");
        al.add("venki");
        al.add("piya");
        al.add("prasad");
        al.clear();
        System.out.println(al);

        System.out.println(al.isEmpty());//isempty method
    }
}

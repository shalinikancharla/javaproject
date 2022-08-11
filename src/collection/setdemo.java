package collection;

import java.util.ArrayList;

public class setdemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shalini");
        al.add("honey");
        al.add("venki");
        al.add("piya");
        al.add("prasad");
        al.set(2,"Hubby");
        System.out.println(al);

    }
}

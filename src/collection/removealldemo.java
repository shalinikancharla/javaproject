package collection;

import java.util.ArrayList;

public class removealldemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shalini");
        al.add("honey");
        al.add("venki");
        al.add("piya");
        System.out.println("before remove all");
        System.out.println(al);

        ArrayList<String> al2=new ArrayList<>();
        al2.add("shalini");
        al2.add("nana");
        al2.add("amma");
        al2.add("piya");
        System.out.println("after remove all");
        al2.removeAll(al);
        System.out.println(al2);//common element removed


    }
}

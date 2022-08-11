package collection;

import java.util.ArrayList;

public class removedemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shalini");
        al.add("honey");
        al.add("venki");
        al.add("piya");
        al.add("prasad");
        System.out.println(al.remove(2));
        System.out.println(al);

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(23);
        al2.add(34);
        al2.add(45);
        al2.add(56);
        al2.add(78);
      //  System.out.println(al2.remove(45));//it will throws an arrayindexoutofbound exception
                                             //for that use wrapper class
        Integer ii= 56;
        al2.remove(ii);
        System.out.println(al2);


    }
}

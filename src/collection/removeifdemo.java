package collection;

import java.util.ArrayList;

public class removeifdemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shalini");
        al.add("honey");
        al.add("venki");
        al.add("piya");
        al.add("prasad");
        al.add("sahasra");

       // al.removeIf(s -> s.charAt(0)=='p');
        //System.out.println("remove starts with p using charAt methoda:"+al);

        al.removeIf(s -> s.endsWith("i"));
        System.out.println( "ends with i:"+al);
        al.removeIf(s -> s.contains("ha"));
        System.out.println("contains with i:"+al);
        al.removeIf(s -> s.startsWith("p"));
        System.out.println("starts with:"+al);



    }
}

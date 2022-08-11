package collection;

import java.util.ArrayList;

public class adddemo1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();//without restrictions it will take hetrogenous elements
        al.add("shalini");
        al.add("12");
        al.add("venki");
        al.add(23);
        al.add("t");
        System.out.println(al);
        ArrayList<String> al1=new ArrayList<>();//with restrictions it will take homogenous elements
        al1.add("shalini");
        al1.add("honey");
        al1.add("venki");
        al1.add("piya");
        al1.add("prasad");
        System.out.println(al1);
        //integer
        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(23);
        al2.add(34);
        al2.add(45);
        al2.add(56);
        al2.add(78);
        System.out.println(al2);
        //for loop
        for(int i=0;i<al2.size();i++)
        {
            System.out.print(al2.get(i)+"\t");
        }
        System.out.println(" ");
        //foreach loop
        for(Integer i: al2)
        {
            System.out.print(i+"\t");
        }
    }
}

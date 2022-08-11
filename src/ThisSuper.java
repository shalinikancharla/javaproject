public class ThisSuper extends SuperE {
    public ThisSuper() {
        System.out.println(super.i);

    }

    public void m1(){
        System.out.println("This is M1");
        this.m2();
    }
    public void m2(){
        System.out.println("This is m2");
        super.sm1();

    }
    public static void main(String[] args){
        ThisSuper thisSuper= new ThisSuper();
        thisSuper.m1();
    }
}

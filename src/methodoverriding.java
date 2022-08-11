


class  Bank
{
    int getrateofinterest( int i)
    {
        System.out.println(i);
        return i;
    }
}
class SBI extends Bank
{
    int getrateofinterest( int i)
    {
        System.out.println(i);
        return i;
    }
}

class HDFC extends Bank
{
    int getrateofinterest( int i)
    {
        System.out.println(i);
        return i;
    }
}

class AXIS extends Bank
{
    int getrateofinterest( int i)
    {
        System.out.println(i);
        return i;
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        Bank obj=new SBI();//webdriver driver=new chromedriver();refers in selenium concept of polymorpism
        obj.getrateofinterest(0);
        Bank obj1=new HDFC();
        obj1.getrateofinterest(1);
        Bank obj2=new AXIS();
        obj2.getrateofinterest(5);

    }
}

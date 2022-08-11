public class patterns {
    public static void main(String[] args) {
        int row=4;
        //Right traangle pattern
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print( " * ");
            }
            System.out.println();
        }

        //left pattern
        int lrow=6;
        for(int i=0;i<row;i++)
        {
            for(int j=2*(lrow-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(" 1");
            }
            System.out.println();
        }




    }
}

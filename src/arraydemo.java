public class arraydemo {
    public static void main(String[] args) {
       /* int[] a = new int[5];
        a[0] = 1;
        a[1] = 23;
        a[2] = 21;
        a[3] = 45;
        a[4] = 21;

        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println();*/
        int[][] a1=new int[2][2];
        a1[0][0]=1;
        a1[0][1]=2;
        a1[1][0]=3;
        a1[1][1]=4;
        int row=a1.length;
        int column=a1[0].length;
        System.out.println(row);
        System.out.println(column);
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }

}

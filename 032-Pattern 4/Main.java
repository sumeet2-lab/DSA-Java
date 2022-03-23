import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
      int n=obj.nextInt();
        // write ur code here
        int nst=n,nsp=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");

            }
            nsp++;
            for(int k=1;k<=nst;k++)
            {
                System.out.print("*\t");

            }
            nst--;
            System.out.println();
        }

    }
}
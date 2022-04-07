import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
         int n=obj.nextInt();
         int nst=1;
         int nsp=n/2;
         int oval=1;
        // write ur code here
        for(int i=1;i<=n;i++)
        {int val=oval;
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");

            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print(val+"\t");
                if(j>nst/2)
                {
                    val--;
                }
                else{
                    val++;
                }
            }
            if(i<=n/2)
            {
                nsp--;
                nst+=2;
                oval++;
            }
            else
            {
                nsp++;
                nst-=2;
                oval--;
            }
            System.out.println();
        }

    }
}
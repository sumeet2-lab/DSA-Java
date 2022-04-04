import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int a=0,b=1;
        int c=0;
        int nst=1;        // write ur code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
            nst++;
        }

    }
}
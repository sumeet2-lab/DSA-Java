import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // write ur code here
        int n =obj.nextInt();
        int num=1,no=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=no;j++)
            {
                System.out.print(num+"\t");
                num++;

            }
            System.out.println();
            no++;
        }

    }
}
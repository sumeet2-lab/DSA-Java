import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
         int n=obj.nextInt();
        // write ur code here
        int nsp=n/2,nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
                            }
            for(int k=1;k<=nst;k++){
                System.out.print("*\t");
            }     
          System.out.println();
            
            if(i<(n/2)+1)
            {
                nsp--;
                nst+=2;
            }
            else
            {
                nsp++;
                nst-=2;
            }
        }

    }
}
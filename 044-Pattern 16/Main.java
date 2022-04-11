import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);

     // write ur code here
     int a=1;
     int b;
     int n=obj.nextInt();
     int nst=1;
     int nsp=2*n-3;
     int c;
     for(int i=1;i<=n;i++)
     {b=a;
         for(int j=1;j<=nst;j++)
         {
             System.out.print(b+"\t");
             b++;

         }
         c=b-1;
         for(int j=1;j<=nsp;j++)
         {
             System.out.print("\t");
         }
         
         for(int j=1;j<=nst;j++)
         {if(i==n){
             j++;
             i++;
             c--;
         }
             System.out.print(c+"\t");
             c--;
         }
         nst++;
         nsp-=2;
         System.out.println();
     }


 }
}
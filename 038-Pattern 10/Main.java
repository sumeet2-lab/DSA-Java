import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

     // write ur code here
     int n=obj.nextInt();
     int nst=1,nsp=n/2;
     int nsp1=-1;
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=nsp;j++){
         System.out.print("\t");
         }
         for(int k=1;k<=nst;k++)
         {
             System.out.print("*\t");
         }
         for(int j=1;j<=nsp1;j++)
         {
             System.out.print("\t");

         }
         if(i!=1 && i!=n){

         
         for(int k=1;k<=nst;k++)
         {
             System.out.print("*\t");
         }}
         if(i>n/2){
             nsp1-=2;
             nsp++;

         }
         else{
             nsp1+=2;
             nsp--;
         }
         System.out.println();
     }


 }
}
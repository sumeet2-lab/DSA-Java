import java.util.Scanner;
public class Main {
public static void main(String[] args){


    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for(int i=1; i<=n; i++){
     for(int j=1; j<=n; j++){
         if(i==j){
             System.out.print("*\t");

         }
         else
         {
             System.out.print("\t");
         }
     }
     System.out.println();
    }
}
}
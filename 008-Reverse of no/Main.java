import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     while(n>0){
       int b=0;
       b=n%10;
       n/=10;
       System.out.println(b);

     }  
    }
   }
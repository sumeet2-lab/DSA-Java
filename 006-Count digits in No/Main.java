import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
    int n =obj.nextInt();
    int i;
   for ( i=0;n>0;i++){
     n=n/10;
   }
   System.out.println(i);
   }
  }
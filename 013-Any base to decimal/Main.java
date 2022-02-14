import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int a=0;
      int pow=0;
      int i=0;
      int sum=0;
      while(n!=0){
         a=n%10;
         pow=(int)Math.pow(b,i);
         sum=sum+a*pow;
         n=n/10;
         i++;
         }
      return sum;
   }
  }
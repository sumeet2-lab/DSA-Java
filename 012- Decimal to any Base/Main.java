import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int a=0;
       int i=0;
       int rem=0;
       int pow;
       while(n!=0){
           rem=n%b;
           pow=(int)Math.pow(10,i);
           a=a+rem*pow;
           n=n/b;
           i++;

       }
       return a;
   }
  }
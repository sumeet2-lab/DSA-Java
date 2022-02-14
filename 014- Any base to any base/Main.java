import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int a=getValueIndecimal(n,sourceBase);
     getValueInBase(a,destBase);
   }   
  
  
   public static void getValueInBase(int n, int destBase){
       // write code here
       int a=0;
       int i=0;
       int rem=0;
       int pow;
       while(n!=0){
           rem=n%destBase;
           pow=(int)Math.pow(10,i);
           a=a+rem*pow;
           n=n/destBase;
           i++;

       }
       System.out.println(a);
   }
  
   public static int getValueIndecimal(int n, int sourceBase){
      // write your code here
      int a=0;
      int pow=0;
      int i=0;
      int sum=0;
      while(n!=0){
         a=n%10;
         pow=(int)Math.pow(sourceBase,i);
         sum=sum+a*pow;
         n=n/10;
         i++;
         }
         return sum;
      
   }
  }
  
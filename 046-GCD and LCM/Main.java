import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
       int b=obj.nextInt();
      int g=GCD(a,b);
      int lcm=(a*b)/g;
      System.out.println(lcm);
      
     }
     public static int GCD(int a,int b)
     {
       
       int c=1;
       while(c!=0)
       {
         c=a%b;
        a=b;
        //System.out.println(a);
        b=c;
        //System.out.println(b);
       }
       System.out.println(a);
       return a;
     }
    }
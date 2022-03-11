import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
 Scanner obj= new Scanner(System.in);
 int n=obj.nextInt();
 int a []= new int[n];
 for(int i=0;i<n;i++){
     a[i]=obj.nextInt();
 }
  hello(a,n);

 }

public static void hello(int a[],int n)
{
    int sub=(int)Math.pow(2,n);
     
    for(int i=0;i<sub;i++){
        int bn=dtb(i);
        int pow=(int)Math.pow(10,n-1);

   
            for(int j=0;j<n;j++){

            int q=bn/pow;
            int rem=bn%pow;
            if(q==1)
            {
                System.out.print(a[j]+"\t");
                
                
            }
            else
            System.out.print("-"+"\t");
            bn=rem;
            pow/=10;
            
        }
    System.out.println();
    }
}

public static int dtb(int i)
{
   int rem=0;
   int ans=0;
   int p=1;
   while(i!=0)
   {
       rem=i%2;
       i/=2;
       ans+=rem*p;
       p*=10;
   }


   int a=reverse(ans);
   return ans;
}

  public static int reverse(int a)
{
    
    int count=0;
    int f=a;
 while(f!=0){
     count++;
     f/=10;
     
 }
  int p=(int)Math.pow(10,count-1);
  int rem=0;
  int ans=0;
  while(a!=0)
  {
    rem=a%10;
    

    
    a/=10;
    ans+=rem*p;
    p/=10;

  }
  return ans;
}

}
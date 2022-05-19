import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner obj=new Scanner(System.in);

  int a=obj.nextInt();

  for(int i=2;i<=a;i++)
  {
    while(a%i==0)
    {
      a=a/i;
      System.out.print(i+" ");
    }
  } 

  }

 }
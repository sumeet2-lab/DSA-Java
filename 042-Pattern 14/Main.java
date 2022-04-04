import java.util.Scanner;
class Main{
      public static void main(String [] args)
      {
            Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            for(int i=1;i<=10;i++)
            {
                  int ans=n*i;
                  System.out.println(n+" * "+i+" = "+ans);
            }
      }
}
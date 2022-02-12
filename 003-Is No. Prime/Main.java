import java.util.*;
class Main{
    public static void main(String[] args)
    {Scanner obj = new Scanner(System.in);
        int t, n;
        
        t= obj.nextInt();
        for(int i=0; i<t; i++){
          boolean abc= true;
            n= obj.nextInt();
            for(int j=2; j<n; j++) {
                if(n%j==0)
                     abc = false;
                 
            }
     if(abc==false)
     System.out.println("not prime");
     else if (abc==true)
     System.out.println("prime");

        }

    }
}
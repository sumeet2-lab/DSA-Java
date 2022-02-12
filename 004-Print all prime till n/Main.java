import java.util.*;
class Main{
    public static Scanner obj=new Scanner(System.in);
     static int a;
    static int b;

    public static void main(String [] args){
         a= obj.nextInt();
         b= obj.nextInt();
        while(a<=b){
                  
        isprime();
         a++;
        }

    }
    public static void isprime()
    { boolean s= true;  
           
        for(int i=2;i<=Math.sqrt(a);i++){
          if (a%i==0){
                s= false;
            }}
            if (s)
            System.out.println(a);
            
        
    

    }
}
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner obj=new Scanner(System.in);
     long n=obj.nextInt(); // no.
     long rotate=obj.nextInt();  //rotate
     long a=n;
     int count=0;
     while(a!=0){
       a=a/10;
       count++;
     }
     rotate=rotate%count;
     if (rotate<0){
       rotate=count+rotate;
     }
     int div=1;
     int mul=1;
     for(int i=1;i<=count;i++){
       if(i<=rotate){
         div=div*10;
       }else{
         mul=mul*10;
       }
     }
    a=n%div;

    n=n/div;
    a=a*mul+n;

    System.out.println(a);
     

    }
   }
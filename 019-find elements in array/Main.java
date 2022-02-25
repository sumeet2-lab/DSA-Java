import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int arr[]=new int [a];
    for (int i=0;i<a;i++){
        arr[i]=obj.nextInt();

    }
    int d=obj.nextInt();
    int fun=Find(arr,d,a);
 System.out.println(fun);
 }

 public static int  Find(int arr[],int b,int length){
     int i;
     for(i=0;i<length;i++){
         if(arr[i]==b)
         return i;;
         
     } 
     return -1;
     
 }

}
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner obj=new Scanner(System.in);
    int a1=obj.nextInt();
    int arr1[]=new int[a1];
    for(int i=0;i<a1;i++){
        arr1[i]=obj.nextInt();
    }


    int a2=obj.nextInt();
    int arr2[]=new int[a2];
    for(int i=0;i<a2;i++){
        arr2[i]=obj.nextInt();
    }
    
    sum(a1,arr1,a2,arr2);
 }
 public static void sum(int a1,int arr1[],int a2,int arr2[]){
     int max=a1;
     if(a1<a2)
     {
         max=a2;
     }

     int carry=0;
     int ans=0;
     
     int arr3[]=new int [max+1];
     
     int j=arr1.length-1;
     int k=arr2.length-1;


     for(int i=max;i>0;i--)
     {
         if(j>=0 && k>=0)
         {
             ans=arr1[j]+arr2[k]+carry;

         }
         else if(j>=0){
             ans=arr1[j]+carry;

         }
         else if(k>=0)
         {
             ans=arr2[k]+carry;

         }

          arr3[i]=ans%10;
          carry=ans/10;
          k--;
          j--;
     }

     for(int i=1;i<=arr3.length-1;i++){
         System.out.println(arr3[i]);
     } 

     

 
 }

}
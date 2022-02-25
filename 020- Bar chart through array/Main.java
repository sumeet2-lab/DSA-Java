import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int [] arr=new int [a];

    for (int i=0;i<a;i++){
        arr[i]=obj.nextInt();
    }
    barchart(arr,a);
 }
 public static void barchart(int arr[],int a){
     int max=0;
     for(int i =0;i<a;i++){
         if(max<=arr[i])
         max=arr[i];
     }
      for (int i=max;i>=1;i--){
          for(int j=0;j<arr.length;j++){
              if(arr[j]>=i){
                  System.out.print("*\t");
              }
              else
              System.out.print("\t");
          }

          System.out.println();
      }
 }

}
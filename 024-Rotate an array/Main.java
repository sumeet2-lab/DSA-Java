import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k)
  {
 // for managing k

 k=k%a.length;
 if(k<0){
   k+=a.length;

 }

    int temp;
    int i=0;
    int j=a.length-1;
    while(i<=j)
    {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    j--;
    i++;
    }
    j=k-1;

   
    for(i=0;i<=j;i++){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      
    j--;
    }


   

    j=a.length-1;
    for( i=k;i<=j;i++){
       temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    j--;
    }



 


    
   

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }
  }
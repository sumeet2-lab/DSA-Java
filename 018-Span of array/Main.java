import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();  
    int arr[]=new int [n];
    for (int i=0;i<n;i++){
        arr[i]=obj.nextInt();

    }
    int max=arr[0];
    int min=arr[0];
    for (int i=0;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    for (int i=0;i<n;i++){
        if(min>arr[i]){
            min=arr[i];
        }
    }

    int diff=max-min;
    System.out.println(diff);

    
 }

}
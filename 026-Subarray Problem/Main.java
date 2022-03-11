import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
 Scanner obj= new Scanner(System.in);
 int n=obj.nextInt();
 int a []= new int[n];
 for(int i=0;i<n;i++){
     a[i]=obj.nextInt();
 }
 

    for(int si=0;si<a.length;si++)
    {
        for(int ei=si;ei<n;ei++){
            for(int i=si;i<=ei;i++ ){
                System.out.print(a[i]+"\t");
            }
        System.out.println();}
        
    }
 }

}
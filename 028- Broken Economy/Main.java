import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int a[]=new int [n];
for(int i=0;i<n;i++)
{
  a[i]=obj.nextInt();
}
int d =obj.nextInt();
int low=0;
int high=a.length-1;
int floor=-1;
int ceil=-1;
while(low<=high)
{
  int mid=(low+high)/2;
  if(d==a[mid]){
    floor=a[mid];
    ceil=a[mid];
  }
  else if(d>a[mid]){
    low=mid+1;
    floor=a[mid];
  }
  else{
    high=mid-1;
    ceil=a[mid];
  }
}

System.out.println(ceil);
System.out.println(floor);



 }

}
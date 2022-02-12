import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner obj= new Scanner(System.in);
  int n =obj.nextInt();
  int count=0;
  int a=n;
  int sum=0;
  while(a!=0){
    a=a/10;
    count++;
  }
  for(int i=1;i<=count;i++){
    a=n%10;
    n=n/10;
   int ads= (int)Math.pow(10,a-1);
  sum=sum+(i*ads);
   
  } System.out.println(sum);


  
 }
}
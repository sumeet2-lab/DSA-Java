import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // write ur code here
  int a= obj.nextInt();
  int nst=a;
  int nsp=0;
  for(int i=0;i<a;i++){
      for(int j=nst;j>=1;j--){
          System.out.print("*\t");

      }
      nst-=1;
      System.out.println();
  }
    }
}
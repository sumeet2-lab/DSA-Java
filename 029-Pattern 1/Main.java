import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        
        for(int i=1;i<=a;i++){
            for(int nst=1;nst<=i;nst++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        // write ur code here

    }
}
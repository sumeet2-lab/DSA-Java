import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int firstTerm = 0, secondTerm = 1;
        if(1 <= n &&n <=40){
        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm);
            
              int nextTerm = firstTerm + secondTerm;
              firstTerm = secondTerm;
              secondTerm = nextTerm;
        }}}}
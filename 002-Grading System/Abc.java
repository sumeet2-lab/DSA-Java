import java.util.*;

class Abc{ 
    
    public static void main(String [] args)
    {
        Scanner obj= new Scanner(System.in);
        int a;
    a=obj.nextInt();

      if (a>90)
      System.out.println("excellent");
      else if(a>81 && a<90)
       System.out.println("good");
      else if(a>71 && a<80)
       System.out.println("fair");
      else if(a>61 && a<70)
       System.out.println("meet expectations");
      else 
      System.out.println("below par");
    }
}
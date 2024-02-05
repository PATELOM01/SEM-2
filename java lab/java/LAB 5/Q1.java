import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      
      double area = Circle(r);
      System.out.println("area=" + area);
    }
    public static double Circle(int r){
        return 3.14*r*r;
    }
}

import java.util.*;
public class Lab 2-4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        char c =Sc.next().charAt(0);
        if(c=='+')
        System.out.println(a+b);
        else if (c=='-')
        System.out.println(a-b);
        else if(c=='*')
        System.out.println(a*b);
        else if(c=='/')
        System.out.println(a/b);
        else if(c=='%')
        System.out.println(a%b);
        {
            if(b==0){
                while(b==0){
                    b=Sc.nextInt();
                    System.out.println(a/b);
                }
            }
            else{

            }
        } 
    }
}
import java.util.*;
class input{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter a value");
        int a=sc.nextInt();
        
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Divison:"+(a/b));
        System.out.println("Multiplication:"+(a*b));
    }
}
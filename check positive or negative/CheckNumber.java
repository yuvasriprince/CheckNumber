import java.util.Scanner;
public class Operator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number:");
        int A = scanner.nextInt();
        if(A>0) {
           System.out.println("positive");
        }  
        else if(A<0) {
           System.out.println("negative");
        } 
        else {
           System.out.println("equal");
        }
    }
}






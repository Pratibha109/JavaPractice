import java.util.*;
public class Pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int a = sc.nextInt();
        System.out.println("Enter the no : ");
        int b = sc.nextInt();

        for(int i=0;  i<a; i++){
            for(int j =0;j<b;j++){
            System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
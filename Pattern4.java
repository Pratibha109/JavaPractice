public class Pattern4 {
    public static void main(String[] args) {
    int a=4;

    for(int i=1;i<=a;i++){
        for(int j=a; j>i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
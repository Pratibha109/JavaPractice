public class Pattern7 {
    public static void main(String[] args) {
        int a = 4;

        for(int i = 1; i<=a; i++){
            for(int j = a; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i ;k++){
                System.out.print("*");
            }
            for(int l = 1 ; l < i ; l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

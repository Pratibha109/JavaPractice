public class Pattern5 {
    public static void main(String[] args) {
        int a = 4;

        for(int i = 1; i <= a; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = a; k>=i ;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

public class Pattern6 {
    public static void main(String[] args) {
        int a = 5;

        for(int i = 1; i<=a; i++){
            for(int j = a; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=a ;k++){
                System.out.print("*");
            }
            for(int l = 1 ; l < a ; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

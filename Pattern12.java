public class Pattern12 {
    public static void main(String[] args) {
        int a = 4;
        for(int i = a; i>0 ; i--){
            for(int j = 0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.print("");
        for(int k = 0; k<=a ; k++){
            for(int l = 0 ; l<=k ; l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
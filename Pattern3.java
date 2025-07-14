public class Pattern3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        for(int i = a; i>0 ; i--){
            for(int j = 1; j<=i ; j++){

                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}

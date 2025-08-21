public class Pattern14 {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 0; i<a; i++){
            for(int j = 0; j<i*2 ; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            int spaceBetween = (a - i - 1) * 4 - 1;

            if (i != a - 1) {
                for (int j = 0; j < spaceBetween; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

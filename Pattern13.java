public class Pattern13 {
    public static void main(String[] args) {  
        int a = 5;
        for(int i = 1; i<=a ; i++){
            for(int j = i; j<a ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i ; k++){
                if(k==1 || i==a){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int l = 2; l<=i; l++){
                if(l==i || i==a){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
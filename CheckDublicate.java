import java.util.HashSet;

public class CheckDublicate {
    public static boolean check(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,4,5,6,7,3,4};
        
        System.out.println();
        System.out.println("arr1 has dublicate? " + check(arr1));
        System.out.println("arr2 has dublicate? " + check(arr2));
       
    }
}

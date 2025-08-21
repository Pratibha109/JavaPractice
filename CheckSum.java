import java.util.HashSet;
import java.util.Scanner;

public class CheckSum {
    public static boolean check(int [] arr,int  target){  
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int comp = target - num;
            if(set.contains(comp)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("enter array elements: ");
        for(int j = 0; j<n; j++){
            arr[j]=sc.nextInt();
        }
        System.out.println("enter target: ");
        int target = sc.nextInt();

        System.err.println("Pair with sum "+ target +"exists? "+ check(arr,target));
        sc.close();
    }
}

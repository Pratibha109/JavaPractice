import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        //int arr1[] = {1,2,3,4,4,5,5};
       // HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,4,5,5));
       // System.out.println("array is : "+ set1);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("\nArray without dublicate elements: "+set);
        System.out.println("Count of Distinct Elements in Array: " + set.size());
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(11,22,33));
        //int [ ] arr2 = {11,22,33};
        set.addAll(set2);
        System.out.println("Union of elements in 2 collections" + set);
        sc.close();
    }
}

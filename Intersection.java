import java.util.HashSet;

public class Intersection {
    public static HashSet<Integer> check(int arr1[],int arr2[]){
    //public HashSet<Integer> check(int arr1[],int arr2[]){
        HashSet set1 = new HashSet<>();
        HashSet set2 = new HashSet<>();

        for(int i = 0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }
        for(int j = 0; j<arr2.length; j++){
            set2.add(arr2[j]);
        }

        set1.retainAll(set2);
        return set1;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,4,5,6,7,8};

        System.out.println("\nIntersection: " + check(arr1, arr2));
    }

    // public static void main(String[] args) {
    //     HashSet<Integer> set1 = new HashSet<>();
    //     set1.add(1);
    //     set1.add(2);
    //     set1.add(3);
    //     set1.add(4);
    //     set1.add(5);
    
    // HashSet<Integer> set2 = new HashSet<>();
    //     set2.add(1);
    //     set2.add(2);
    //     set2.add(7);
    //     set2.add(6);
    //     set2.add(5);

    //     set1.retainAll(set2);
    
    //     System.out.println(set1);
    //     System.err.println(set2);
    //     System.out.println("intersection: "+set1);

    // }
}

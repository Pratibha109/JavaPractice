import java.util.HashSet;

public class UniqueChar {
    public static boolean Check(String str){
    HashSet <Character> s = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!s.add(ch)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "Ayush";
        System.out.println("Does " + s1 + " have dublicate charectors: "+ Check(s1));
        String s2 = "Ayushhhh";
        System.out.println("Does " + s2 + " have dublicate charectors: "+ Check(s2));
    }
}

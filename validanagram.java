import java.util.HashMap;
import java.util.Scanner;

public class validanagram {

    public boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < s1.length(); i++) {
        //     map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        // }

        // for (int i = 0; i < s2.length(); i++) {
        //     char ch = s2.charAt(i);
        //     if (map.containsKey(ch)) {
        //         if (map.get(ch) == 1) {
        //             map.remove(ch);
        //         } else {
        //             map.put(ch, map.get(ch) - 1);
        //         }
        //     } else {
        //         return false;
        //     }
        // }

        // return map.isEmpty();
        int [] arr = new int[26];
        for(int i=0;i<s1.length();i++){
          arr[s1.charAt(i)-'a']++;
          arr[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
            return false;
          }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();

        System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();

        validanagram obj = new validanagram();
        boolean result = obj.checkAnagram(s1, s2);
        System.out.println("Are they anagrams? " + result);

        sc.close();
    }
}

import java.util.*;

public class may29 {

    public static void main(String[] args) {
        String str = "bbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
    
    /**
     * Longest substring with unique characters
     * @param s
     * @return length of the substring
     */
    public static int lengthOfLongestSubstring(String s) {

        ArrayList<Character> list = new ArrayList<>();
        int currString = 0;
        int maxString = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.contains(c)) {
                int index = list.indexOf(c);
                list.add(c);
                list = new ArrayList<>(list.subList(index+1, list.size())); // subList is exclusive at the end
                currString = list.size();
            } else {
                list.add(c);
                currString++;
                if (currString > maxString) {
                    maxString = currString;
                }
            }
        }

        return maxString;
    }
}
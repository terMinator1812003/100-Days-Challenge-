import java.util.HashMap;

public class IsomorphicStrings_205 {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Integer> charToindex_s = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charToindex_t = new HashMap<Character, Integer>();
        for (Integer i = 0; i < s.length(); ++i) {
            if (charToindex_s.put(s.charAt(i), i) != charToindex_t.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;

    }

}

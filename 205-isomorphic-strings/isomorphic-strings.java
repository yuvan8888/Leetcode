import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Base case: if lengths are different, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }
        
        // Map to store character pairs (s -> t)
        HashMap<Character, Character> charMap = new HashMap<>();
        // Set to keep track of characters in t that are already mapped
        HashSet<Character> mappedChars = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // If charS has been seen before
            if (charMap.containsKey(charS)) {
                // Check if it maps to the correct character in t
                if (charMap.get(charS) != charT) {
                    return false;
                }
            } else {
                // If charS is new, but charT is already assigned to someone else
                if (mappedChars.contains(charT)) {
                    return false;
                }
                
                // Establish the new mapping
                charMap.put(charS, charT);
                mappedChars.add(charT);
            }
        }
        
        return true;
    }
}
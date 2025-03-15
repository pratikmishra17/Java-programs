public class MergeAlternateStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;
        
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j++));
            }
        }
        
        return merged.toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("Merged String: " + sol.mergeAlternately(word1, word2));
        
        // Additional test cases
        System.out.println("Merged String: " + sol.mergeAlternately(" Hello ", "world"));
        System.out.println("Merged String: " + sol.mergeAlternately("abcd", "pq"));
    }
}

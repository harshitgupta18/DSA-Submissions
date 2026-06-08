class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty input array
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Edge case: only one word in the array
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder prefix = new StringBuilder();
        String firstWord = strs[0];

        // Loop through each character of the first word
        for (int i = 0; i < firstWord.length(); i++) {
            char prefixCandidate = firstWord.charAt(i);

            // Compare this character with the same position in all other words
            for (int j = 1; j < strs.length; j++) {
                // Check if current word is shorter than index 'i' 
                // OR if the character does not match
                if (i >= strs[j].length() || strs[j].charAt(i) != prefixCandidate) {
                    return prefix.toString();
                }
            }

            // Character matches in all words, add it to the prefix
            prefix.append(prefixCandidate);
        }

        return prefix.toString();
    }
}
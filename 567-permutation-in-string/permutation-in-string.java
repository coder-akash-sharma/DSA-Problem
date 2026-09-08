class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency of s1
        int[] count1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        // First window of s2
        int windowLength = s1.length();
        int[] count2 = new int[26];

        for (int i = 0; i < windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        // Check first window
        if (compareFreq(count1, count2)) {
            return true;
        }

        // Sliding window
        int i = windowLength;

        while (i < s2.length()) {

            // Add new character
            char newChar = s2.charAt(i);
            int newCharIndex = newChar - 'a';
            count2[newCharIndex]++;

            // Remove old character
            int oldCharIndex = i - windowLength;
            char oldChar = s2.charAt(oldCharIndex);
            int oldIndex = oldChar - 'a';
            count2[oldIndex]--;

            // Compare frequencies
            if (compareFreq(count1, count2)) {
                return true;
            }

            i++;
        }

        return false;
    }

    // Compare two frequency arrays
    public boolean compareFreq(int[] count1, int[] count2) {

        for (int i = 0; i < 26; i++) {

            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}
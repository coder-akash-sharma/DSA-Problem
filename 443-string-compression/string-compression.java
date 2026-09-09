
class Solution {
    public int compress(char[] chars) {

        int writeIndex = 0;
        int readIndex = 0;

        while (readIndex < chars.length) {

            char currentChar = chars[readIndex];
            int count = 0;

            // Count consecutive characters
            while (readIndex < chars.length &&
                   currentChar == chars[readIndex]) {

                readIndex++;
                count++;
            }

            // Write the character
            chars[writeIndex] = currentChar;
            writeIndex++;

            // Write the count
            if (count > 1) {

                String countStr = String.valueOf(count);

                for (char digit : countStr.toCharArray()) {
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }

        return writeIndex;
    }
}


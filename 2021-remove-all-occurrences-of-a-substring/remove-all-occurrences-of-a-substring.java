class Solution {
    public String removeOccurrences(String s, String part) {
        while( s.contains(part)){
            // search inside s
            int index = s.indexOf(part);

            // merge the left and right substring

            s=s.substring(0, index)+s.substring(index+part.length());
        }
        return s;
    }
}
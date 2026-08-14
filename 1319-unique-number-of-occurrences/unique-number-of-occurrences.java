class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> arrayMap = new HashMap<>();
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            arrayMap.put(num, arrayMap.getOrDefault(num, 0) + 1);
        }

        for (int frequency : arrayMap.values()) {
            if (!uniqueSet.add(frequency)) {
                return false;
            }
        }

        return true;
    }
}
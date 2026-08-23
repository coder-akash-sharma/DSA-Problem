class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
        int index = 0;

        // Find numbers appearing once
        for (int num : nums) {
            if (map.get(num) == 1) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}
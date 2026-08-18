class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n==1){
            return nums[0];
        }
       for(int i =0; i< n-1; i+=2){
            
            if(nums[i] != nums[i+1]){
                return nums[i];
            }

        }
        return nums[nums.length-1];
        }
       }

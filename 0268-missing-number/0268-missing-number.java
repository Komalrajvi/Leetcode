class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            xor ^= i ^ nums[i];
        }
         return xor ^ nums.length;
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null) { return; }

        for(int zeroIndex = 0, nonZeroIndex = 0; zeroIndex < nums.length; zeroIndex++){
            if(nums[zeroIndex] != 0){
                int temp = nums[zeroIndex];
                nums[zeroIndex] = 0;
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}

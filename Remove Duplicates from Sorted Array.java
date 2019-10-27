class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        for(int i=0, j=1; j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                counter+=1;
            }
        }

        return counter;
    }
}

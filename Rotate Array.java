class Solution {
    public void rotate(int[] nums, int k) {
//         int[] rotatedNums = new int[nums.length];
//         int i = 0;
//         int index = nums.length-k;
//         while(index<nums.length){
//             rotatedNums[i] = nums[index];
//         }

//         while(0 < index){
//             rotatedNums[i] = nums[index];
//         }
//         nums = rotatedNums;

//      Above solution didn't work because of time constraints

        k = k % nums.length;

        reverseArray(nums, 0, nums.length-1);

        reverseArray(nums, 0, k-1);

        reverseArray(nums, k, nums.length-1);
    }

    private void reverseArray(int[] nums, int start, int end){
        while(start<=end){
            int temp =  nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

class Solution {
    public int singleNumber(int[] nums) {

        //XOR approach.
        //Time complexity: O(n)
        //Space complexity: O(1)

        //Reasoning
        //XOR 2 same bits: a ^ a = 0
        //XOR a bit and 0: a ^ 0 = a
        //XOR a ^ b ^ a = (a ^ a) ^ b = b

        int xor = 0;
        for(int num: nums){
            xor ^= num;
        }

        return xor;

        //Sorted array approach
//         Arrays.sort(nums);

//         //Initialize duplicate to the last element because if you loop through the array and still don't find a duplicate by the last iteration, then the duplicate has to be the last element.
//         int duplicate = nums[nums.length-1];

//         for(int i=0; i< nums.length-1; i+=2){
//             if(nums[i] != nums[i+1]){
//                 duplicate = nums[i];
//                 break;
//             }
//         }
//         return duplicate;

        //Hashtable approach
        // Set<Integer> set = new HashSet<Integer>();
        // int sum = 0;
        // for(int num: nums){
        //     if(!set.add(num)){
        //         sum-=num;
        //     } else {
        //         sum+=num;
        //     }
        // }

//         return sum;


    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
            int current = nums[i];
            if(map.containsKey(target-current) && map.get(target-current) != i){
                solution[0] = i;
                solution[1] = map.get(target-current);
                break;
            } else {
                map.put(nums[i], i);
            }
        }


        return solution;
    }
}

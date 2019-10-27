class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //Time complexity: O(N+M) - O(N) for iterating the array to create a hashmap and O(M) to iterate the other array
        //Space complexity: O(N) - Hashmap storage

        List<Integer> list = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                int value = map.get(nums1[i]);
                map.put(nums1[i], ++value);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                int value = map.get(nums2[i]);
                if(value > 0){
                    list.add(nums2[i]);
                    map.put(nums2[i], --value);
                }
            }
        }

        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}

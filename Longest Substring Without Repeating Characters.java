class Solution {
    public int lengthOfLongestSubstring(String s) {

        //Sliding window solution
        //Time complexity: O(n)
        //Space complexity: O(1) since there are only 26 possible characters
        Set<Character> set = new HashSet<>();
        int longest = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            if(set.add(s.charAt(right))){
                right++;
                longest = Math.max(longest, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }

        return longest;


//         //Brute force solution
//         //Time complexity: O(n^2)
//         //Space complexity: O(min(m,n))
//         HashSet<Character> chars = new HashSet<Character>();
//         int longestStringLength = 0;


//         for(int i = 0; i < s.length(); i++) {
//             int substringLength = 0;

//             for(int j = i; j < s.length(); j++){
//                 if(chars.add(s.charAt(j))){
//                     substringLength++;
//                 } else {
//                     break;
//                 }
//             }

//             if(substringLength > longestStringLength){
//                 longestStringLength = substringLength;
//             }

//             chars.clear();
//         }

//         return longestStringLength;
    }
}

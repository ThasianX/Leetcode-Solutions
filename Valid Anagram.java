class Solution {
    public boolean isAnagram(String s, String t) {
        //Time complexity: O(n) because accessing the the hashmap is a constant time operation
        //Space complexity: O(1) because the hash table can only get up to a size of 26, since there are 26 characters int the alphabet.

        if(s.length() != t.length()){ return false; }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            } else {
                return false;
            }
        }

        return true;
    }
}

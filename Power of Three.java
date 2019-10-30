class Solution {
    public boolean isPowerOfThree(int n) {
        //Uses the max integer that is also a power of 3. Any power of 3 under 3^19 will always divide evenly into 3^19.
        return n > 0 && 1162261467 % n == 0;
    }
}

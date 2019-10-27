class Solution {
    public int reverse(int x) {
        //Time Complexity: O(log(x))
        //Space Complexity: O(1)

        int reversedX = 0;

        while(x!=0){
            int digit = x % 10;

            //Checks to see if appending more digits will cause an overflow
            if (reversedX > Integer.MAX_VALUE/10 || (reversedX == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (reversedX < Integer.MIN_VALUE/10 || (reversedX == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            reversedX = reversedX * 10 + digit;
            x/=10;
        }

        return reversedX;
    }
}

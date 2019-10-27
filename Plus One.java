class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1; i>= 0; i--){
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if(digits[0] == 0){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for(int i = 1; i<newDigits.length; i++){
                newDigits[i] = 0;
            }

            return newDigits;
        }

        return digits;
    }
}

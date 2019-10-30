class Solution {
    public int countPrimes(int n) {
        //Time complexity: O(n log log n)
        //Space complexity: O(n)

        boolean[] isPrime = new boolean[n];

        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i < n; i++){
            if(!isPrime[i]) { continue; }
            for(int j = i*i; j < n; j+=i){
                isPrime[j] = false;
            }
        }

        int counter = 0;

        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                counter++;
            }
        }

        return counter;
    }

    public boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

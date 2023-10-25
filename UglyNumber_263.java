public class UglyNumber_263.java{

    public boolean isUgly(int n) {
        if (n == 0)
            return false;

        int[] primes = {2, 3, 5};
        for (int i = 0; i < primes.length; i++) {
            int prime = primes[i];
            while (n % prime == 0) {
                n /= prime;
            }
        }

        return n == 1;
    }
}
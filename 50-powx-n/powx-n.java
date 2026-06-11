class Solution {
    public double myPow(double x, int n) {
        // Use a long to handle the integer overflow edge case when n = Integer.MIN_VALUE
        long N = n;
        
        // If the exponent is negative, invert the base and make the exponent positive
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        // Binary Exponentiation
        while (N > 0) {
            // If the current bit of N is 1, multiply the result by the current product
            if (N % 2 == 1) {
                result *= currentProduct;
            }
            // Square the base for the next bit
            currentProduct *= currentProduct;
            // Shift N to the right (divide by 2)
            N /= 2;
        }
        
        return result;
    }
}
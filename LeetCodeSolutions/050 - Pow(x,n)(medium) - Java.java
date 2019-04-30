class Solution {
    public double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if(n > 0 && ((n & 1) == 1)) {
            double val = myPow(x, n/2);
            return x * val * val;
        } else
        if (n > 0 && ((n & 1) == 0)) {
            double val = myPow(x, n >> 1);
            return val * val;
        }else
        if (n < 0 && ((-n & 1) == 1)) {
            double val = myPow(x, -n >> 1);
            return 1/(x * val * val);
        }
        else
        if (n < 0 && ((-n & 1) == 0)) {
            double val = myPow(x, -n >> 1);
            return 1/(val * val);
        } else { return 1;}
        
    }
}

class Solution {
    public int mySqrt(int x) {
        
        if (x == 0 || x == 1) return x;
        
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            
            // Avoid overflow by dividing instead of multiplying
            if (mid <= x / mid) {
                ans = mid;          // store possible answer
                start = mid + 1;    // try bigger value
            } else {
                end = mid - 1;      // try smaller value
            }
        }
        
        return ans;
    }
}


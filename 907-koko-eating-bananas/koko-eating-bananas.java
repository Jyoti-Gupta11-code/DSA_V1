class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ;
       int high = 0 ;
 // kitne pile hai maximum nikalane le liye 
 
       for (int i = 0 ; i < piles.length ; i ++){
       if (piles[i] > high) {
                high = piles[i];
            }
       }

       while ( low <= high ){
      int   mid =  low + (high - low ) / 2     ;
       long  totalHours = 0 ;
        for (int i = 0; i < piles.length; i++) {
                totalHours += (piles[i] + mid - 1) / mid;  // ceil division
            }
                if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


       
      return low ;
        
    }

}
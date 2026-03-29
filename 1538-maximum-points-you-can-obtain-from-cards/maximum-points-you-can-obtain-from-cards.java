class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length ;
        int   totalSum = 0;
       
       for (int i = 0 ; i<= k - 1 ; i ++)   {
       
        totalSum +=  cardPoints[i] ;
         
       }
        int  maxSum = totalSum ;

      int  rightIndex = n-1 ;
       for(int i = k - 1 ; i>= 0 ; i --){
        totalSum -=  cardPoints[i] ;
        totalSum += cardPoints[rightIndex];
        rightIndex -- ;
       
        maxSum = Math.max(maxSum , totalSum) ;

       }
       return maxSum ;
        
    }
}  
  
 
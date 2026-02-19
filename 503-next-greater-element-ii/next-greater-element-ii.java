class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length ;
        int [] ans = new int[n] ;

        Stack<Integer> stack = new Stack<>() ; 
        for (int i = 2 * n -1 ; i>= 0 ; i--){
            int index = i % n ;

            while (!stack.isEmpty() && nums[stack.peek()] <= nums[index]) {
                stack.pop();
            }


            if(stack.isEmpty()){
                ans[index] = -1 ;
            } else {
                ans[index] = nums[stack.peek()];
            }
             stack.push(index);  

        }

        return ans ; 
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false ;
        }
        String doubleresult = s + s ;
        boolean req = doubleresult.contains(goal);
        return  req ;
        
    }
}
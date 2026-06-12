class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder output = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                   if (count > 0) {
                    output.append(ch);  
           
                }
                count  ++;
            } else { 
                count --;
                if (count > 0) {
                    output.append(ch);
                }
            }
        }

        return output.toString();
    }
}


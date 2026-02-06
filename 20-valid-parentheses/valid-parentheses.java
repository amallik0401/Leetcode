class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
        {
            if(c == '(' || c == '{' || c== '[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                    return false;

                char s = stack.pop();
                
                if( (s == '(' && c != ')') ||
                    (s == '{' && c != '}') ||
                    (s == '[' && c != ']'))
                {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}
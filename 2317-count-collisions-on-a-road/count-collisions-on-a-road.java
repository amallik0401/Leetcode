class Solution {
    public int countCollisions(String directions) {

        Stack<Character> st = new Stack<>();

        int count = 0;
        char[] ch = directions.toCharArray();
        for(char s : ch)
        {
            if(st.isEmpty())
            {
                st.push(s); 
                continue;
            }
            char cr = st.peek();

            if(s == 'R' && cr == s)
            {
                st.push('R');
                continue;        
            }
            if(cr != s)
            {
                if(cr == 'S')
                {
                    if(s == 'L')
                        count++;
                    else
                    {
                        st.push('R');
                    }
                }
                else if(s == 'S')
                {
                    if(cr == 'R')
                    {
                        st.pop();
                        count++;
                    }
                    
                    st.push('S');
                }
                else if(cr == 'R' && s== 'L')
                {
                    count+=2;
                    st.pop();
                    st.push('S');
                }
                else
                {
                    st.pop();
                    st.push(s);
                }
            }
        }  

        char prev = 'a';
        while(!st.isEmpty())
        {
            char top = st.pop();

            if(top == prev)
            {
                continue;
            }

            if(top == 'R' && prev == 'S')
            {
                count++;
                st.push('S');
            }
            prev = top;
        }
        return count;      
    }
}
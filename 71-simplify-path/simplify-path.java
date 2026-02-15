class Solution {
    public String simplifyPath(String p) {

        Stack<String> st = new Stack<>();
        String[] arr = p.split("/");

        for(String ch : arr)
        {
            if(ch.equals(".") || ch.equals(""))
                continue;
            else if(ch.equals(".."))
            {
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty())
        {
            sb.insert(0,st.pop()).insert(0 , '/');
        }

        return (sb.length() == 0) ? "/" : sb.toString();
    }
}
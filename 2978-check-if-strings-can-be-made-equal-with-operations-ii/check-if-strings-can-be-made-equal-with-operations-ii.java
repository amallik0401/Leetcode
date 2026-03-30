class Solution {
    public boolean checkStrings(String s1, String s2) {
        Map<Character , Integer> even = new HashMap<>();
        Map<Character , Integer> odd = new HashMap<>();

        for(int i =0 ; i < s1.length() ; i++)
        {
            char ch = s1.charAt(i);

            if(i%2==0)
            {
                if(even.containsKey(ch))
                {
                    even.put(ch , even.get(ch) + 1);
                }
                else
                {
                    even.put(ch , 1);
                }
            }
            else
            {
                if(odd.containsKey(ch))
                {
                    odd.put(ch , odd.get(ch) + 1);
                }
                else
                {
                    odd.put(ch , 1);
                }
            }
        }

        for(int i =0 ; i < s1.length() ; i++)
        {
            char ch = s2.charAt(i);

            if(i%2==0)
            {
                if(even.containsKey(ch))
                {
                    even.put(ch , even.get(ch) - 1);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(odd.containsKey(ch))
                {
                    odd.put(ch , odd.get(ch) - 1);
                }
                else
                {
                    return false;
                }
            }
        }

        for (Character key : even.keySet()) 
        {
            if(even.get(key) != 0)
                return false;
        }
        for (Character key : odd.keySet()) 
        {
            if(odd.get(key) != 0)
                return false;
        }


        return true;
    }
}
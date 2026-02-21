class Solution {
    public boolean isPathCrossing(String path) {
        Set<String>set = new HashSet<>();
        set.add("0,0");
        int x = 0;
        int y = 0;

        for(char c : path.toCharArray())
        {

            switch (c) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }

            String s = x+"," + y;

            if(!set.add(s))
            {
                return true;
            }
        }

        return false;

    }
}
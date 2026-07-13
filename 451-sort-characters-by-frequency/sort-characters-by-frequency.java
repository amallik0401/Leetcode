class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> map = new HashMap<>();

        for(char c  : s.toCharArray())
        {
            map.put(c , map.getOrDefault(c , 0)+1);
        }

        PriorityQueue<Character> hp = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        hp.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while(!hp.isEmpty())
        {
            char ch = hp.poll();

            for(int i = 0 ; i < map.get(ch) ; i++)
            {
                sb.append(ch);
            } 
        }

        return sb.toString();
    }
}
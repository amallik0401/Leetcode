class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);

        List<List<Integer>> ls = new ArrayList<>();
        int min = 1000;

        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            int diff = Math.abs(arr[i] - arr[i+1]);
            min = Math.min(min , diff);
        }

        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(Math.abs(arr[i] - arr[i+1]) == min)
            {
                ls.add(List.of(arr[i] , arr[i+1]));
            }
        }

        return ls;
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));

        for(int i = 0 ; i < rowIndex ; i++)
        {
            List<Integer> DR = new ArrayList<>();
            DR.add(0);
            DR.addAll(res.get(res.size()-1));
            DR.add(0);

            List<Integer> row = new ArrayList<>();

            for(int j = 0 ; j < DR.size() - 1 ; j++)
            {
                row.add(DR.get(j) + DR.get(j + 1));
            }
            res.add(row);
        }

        return res.get(rowIndex);
    }
}
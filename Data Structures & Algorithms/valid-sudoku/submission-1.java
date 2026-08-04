class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rowSet = new HashSet[9];
        Set<Integer>[] colSet = new HashSet[9];
        Set<Integer>[] boxSet = new HashSet[9];

        for(int i = 0; i < 9; i++)
        {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            boxSet[i] = new HashSet<>();
        }


        for(int i = 0; i < 9; i ++)
        {
            for(int j = 0; j < 9; j++)
            {
                char c = board[i][j];
                if(c == '.')
                {
                    continue;
                }
                int val = c - '0';

                int boxIndex = (i / 3) * 3 + (j / 3);

                if(rowSet[i].contains(val) || colSet[j].contains(val) || boxSet[boxIndex].contains(val)) return false;
                rowSet[i].add(val);
                colSet[j].add(val);
                boxSet[boxIndex].add(val);
            }
            

        }
        return true;
    }
}

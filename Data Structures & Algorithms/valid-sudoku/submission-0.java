class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(char[] row : board)
        {
            Set<Character> myRowHashSet = new HashSet<>();
            int numberCounterRow = 0;
            for(char c : row)
            {
                
                if(c != '.')
                {
                    myRowHashSet.add(c);
                    numberCounterRow++;
                }
            }
            if(myRowHashSet.size() != numberCounterRow) return false;
            
                
            
        }

        for(int column = 0; column < board[0].length; column++)
        {
            Set<Character> myColHashSet = new HashSet<>();
            int colNumberCounter = 0;
            for(int row = 0; row < board.length; row++)
            {
                if(board[row][column] != '.')
                {
                    colNumberCounter++;
                    myColHashSet.add(board[row][column]);
                }
            }
            if(myColHashSet.size() != colNumberCounter) return false;
        }

        int box = 0;
        int column = 0;
        while(box < 9)
        {

            Set<Character> threeByThree = new HashSet<>();
            int number = 0;
            for (int i = box; i < box + 3; i++) {

                for (int j = column; j < column + 3; j++) {
                    if(board[i][j] != '.')
                    {
                        number++;
                        threeByThree.add(board[i][j]);
                    }
                }
            }

            if(number != threeByThree.size()) return false;
            
            column+=3;
            if(column > 6)
            {
                column = 0;
                box+=3;
            }
        }
        return true;


        


            
    }
}

package Q2;
public class Q2 {
    public void solveSudoku(char[][] board) {
        solve( board , 0 , 0 );
    }

    public boolean solve( char[][] board, int row, int col ){
        if( row==9 ) return true;
        if( col==9 ) return solve( board , row+1, 0 );
        if( board[row][col] != '.'  )  return solve( board , row , col+1 );
        
        for( int i = '1'; i<='9'; i++ ){
            char c = (char) i;
            if( isSafe( board , c, row, col ) ){
                board[row][col] = c;
                if( solve( board , row , col+1 ) ) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    public boolean isSafe( char[][] board, char toPlace, int x, int y  ){
        for( int i=0; i<9; i++ ){
            if( board[i][y] == toPlace ) return false;
            if( board[x][i] == toPlace ) return false;
        }

        int v = (x/3) * 3;
        int h = (y/3) * 3;

        for( int i = v; i<v+3; i++  ){
            for( int j = h; j<h+3; j++ ){
                if( board[i][j]==toPlace ) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        char[][] sudokuBoard = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        q2.solveSudoku(sudokuBoard);

        for( int i=0; i<9; i++ ){
            for( int j=0; j<9; j++ ){
                System.out.print(sudokuBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}

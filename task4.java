// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class task4 {
    static int N = 8;
    static int numberQueens = N;
    static int chessBoard [][] = new int [N][N];
    public static void main(String[] args) {
        
        ShowChessboard(); // показать доску

    }

    // показать доску
    public static void ShowChessboard() {
        for (int i = 0; i < N; ++i)
            {
                for (int j = 0; j < N; ++j)
                {
                    // если в массиве элемент = 1 печатать "*", иначе "."
                    System.out.print((chessBoard[i][j]==1) ? "* " : ". ");
                }
                System.out.print('\n');
            }
    }
}

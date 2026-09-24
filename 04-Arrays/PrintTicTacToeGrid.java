
public class PrintTicTacToeGrid {

    public static void main(String[] args) {

        char[][] arr = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };

        for (char[] row : arr) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}

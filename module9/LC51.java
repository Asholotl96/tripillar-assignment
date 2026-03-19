// 51. N-Queens
class LC51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] b = new char[n][n];
        for (char[] row : b) {
            Arrays.fill(row, '.');
        }
        backtrack(b, 0, res);
        return res;
    }

    private void backtrack(char[][] b, int row, List<List<String>> res) {
        if (row == b.length) {
            res.add(soln(b));
            return;
        }
        for (int col = 0; col < b.length; col++) {
            if (isValid(b, row, col)) {
                b[row][col] = 'Q';
                backtrack(b, row + 1, res);
                b[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] b, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (b[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (b[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < b.length; i--, j++) {
            if (b[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> soln(char[][] b) {
        List<String> solution = new ArrayList<>();
        for (char[] row : b) {
            solution.add(new String(row));
        }
        return solution;
    }
}
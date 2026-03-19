// 22. Generate Parentheses
class LC22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(int n, int left, int right, StringBuilder sb, List<String> res) {
        if (sb.length() == 2 * n) {
            res.add(sb.toString());
            return;
        }
        if (left < n) {
            sb.append('(');
            backtrack(n, left + 1, right, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right < left) {
            sb.append(')');
            backtrack(n, left, right + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
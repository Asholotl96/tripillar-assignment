// 39. Combination Sum
class LC39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(candidates, target, 0, subset, res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> subset, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(subset));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            subset.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
}
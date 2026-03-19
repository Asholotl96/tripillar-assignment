// 46. Permutations
class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        generatePermutations(nums, perm, used, res);
        return res;
    }

    private void generatePermutations(int[] nums, List<Integer> perm, boolean[] used, List<List<Integer>> res) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm.add(nums[i]);
                generatePermutations(nums, perm, used, res);
                perm.remove(perm.size() - 1);
                used[i] = false;
            }
        }
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
	List<List<Integer>> permList = new ArrayList<>();
	generatePerm(nums, new ArrayList<>(), permList, new boolean[nums.length]);
	return permList;
    }
    void generatePerm(int[] nums, List<Integer> perm, List<List<Integer>> permList, boolean[] used) {
        if (perm.size() == nums.length) 
				permList.add(new ArrayList(perm));
        for (int i = 0; i < nums.length; i++)
            if (!used[i]) {
                used[i] = true;
				perm.add(nums[i]);
				generatePerm(nums, perm, permList, used);
				perm.remove(perm.size() - 1);
				used[i] = false;
            }
    }
}
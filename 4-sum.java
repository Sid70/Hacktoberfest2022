class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        if (nums == null || nums.length < 4) return new ArrayList<>(set);
        int size = nums.length;
        for (int i = 0; i < size - 3; i++) {
            for (int j = i + 1; j < size - 2; j++) {
                long target2 = (long)target - nums[i] - nums[j];
                int left = j + 1;
                int right = size - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target2) {
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);
                        left++;
                        right--;
                    } else if (sum > target2) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

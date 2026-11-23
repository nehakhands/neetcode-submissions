class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        List<Integer> numsList = Arrays.stream(nums)
                               .boxed()
                               .collect(Collectors.toList());
        for (int i=0;i<numsList.size();i++) {
            int temp = target - nums[i];
            if (numsList.contains(temp)) {
                int index = numsList.indexOf(temp);
                indices[0] = i < index ? i : index;
                indices[1] = i < index ? index : i;
            }
        }
        return indices;
    }
}

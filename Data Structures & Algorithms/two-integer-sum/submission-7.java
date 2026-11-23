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
                if (i < index) {
                    indices[0] = i;
                    indices[1] = index;
                } else {
                    indices[0] = index;
                    indices[1] = i;
                }
                
            }
        }
        return indices;
    }
}

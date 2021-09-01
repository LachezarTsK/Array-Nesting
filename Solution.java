public class Solution {

    public int arrayNesting(int[] nums) {

        int maxGroupSize = 0;
        int visited = -1;// since 0 <= nums[i] < nums.length

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != visited) {

                int currentGroupSize = 0;
                int next = i;

                while (nums[next] != visited) {
                    int temp = next;
                    next = nums[next];
                    nums[temp] = visited;
                    currentGroupSize++;
                }
                maxGroupSize = Math.max(currentGroupSize, maxGroupSize);
            }
        }
        return maxGroupSize;
    }
}

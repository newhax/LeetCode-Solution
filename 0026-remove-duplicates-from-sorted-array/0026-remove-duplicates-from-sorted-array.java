class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) return 0;

        int k = 1; // first element is always unique, so k starts at 1

        for (int i = 1; i < nums.length; i++) {
            // If current element differs from the last unique one placed at k-1,
            // it's a new unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
      //better solution 
       if (nums.length == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        int longest = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;

        // Step 2: Traverse the sorted array
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] - 1 == lastSmaller) {

                // Consecutive number found
                count++;
                lastSmaller = nums[i];
            }

            else if (nums[i] != lastSmaller) {

                // New sequence starts
                count = 1;
                lastSmaller = nums[i];
            }

            // Update maximum length
            longest = Math.max(longest, count);
        }

        return longest;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        //better solution
         int[] freq = new int[nums.length];

        for(int num : nums) {

            if(freq[num] == 1) {
                return num;
            }

            freq[num]++;
        }

        return -1;
    }
}